package com.besant.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	

	    // Database details
	    private static final String URL =
	            "jdbc:mysql://localhost:3306/faisal";

	    private static final String USER = "root";

	    private static final String PASSWORD = "Faisal22@mysql";

	    // Private constructor
	    private DBUtil() {

	    }

	    // Method to create connection
	    public static Connection getConnection() {

	        Connection conn = null;

	        try {

	            // Load MySQL Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish connection
	            conn = DriverManager.getConnection(URL, USER, PASSWORD);

	            System.out.println("Database Connected Successfully!");

	        } catch (ClassNotFoundException e) {

	            System.out.println("JDBC Driver Not Found");
	            e.printStackTrace();

	        } catch (SQLException e) {

	            System.out.println("Database Connection Error");
	            e.printStackTrace();
	        }

	        return conn;
	    }

	    // Method to close connection
	    public static void closeConnection(Connection conn) {

	        if (conn != null) {

	            try {

	                conn.close();

	                System.out.println("Connection Closed");

	            } catch (SQLException e) {

	                e.printStackTrace();
	            }
	        }
	    }
	}


