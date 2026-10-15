package com.besant.jdbc;

import java.sql.Connection;

public class TestConnection {
	 
		public static void main(String[] args) {

			System.out.println("Program Started");

			Connection conn = DBUtil.getConnection();

			if(conn != null) {

				System.out.println("Connection Success");

			} else {

				System.out.println("Connection Failed");
			}

			DBUtil.closeConnection(conn);

			System.out.println("Program Ended");
		}
	

}
