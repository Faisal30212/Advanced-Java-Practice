package com.besant.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {

    // Database details
    static String url = "jdbc:mysql://localhost:3306/javaDB";
    static String username = "root";
    static String password = "Faisal22@mysql";

    public static void main(String[] args) {

        System.out.println("Loading the MySQL Driver");

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established");

            // 3. Create Statement
            Statement st = con.createStatement();

            // 4. Execute Query
            ResultSet rs = st.executeQuery("SELECT * FROM emp");

            // 5. Read data from ResultSet
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getInt(3)
                );
            }

            // 6. Close resources
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// write down the steps involed in establisheng mysql to java?
//diffrence between stement,prepared staement ,callable statement