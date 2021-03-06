package com.charlie.connection;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	

	

		private static final String URL = "jdbc:mysql://localhost:3306/InspireQuotes?serverTimezone=EST5EDT";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "1charlie7Ms"; 
															
	// The goal is to have only one connection open during the session of entire application
		private static Connection connection; // will be null at moment
		
		
		private static void makeConnection() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Registered Driver from Singleton class");
				
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				System.out.println("Connected  from Singleton class ");
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
		}
		

		public static Connection getConnection() {

			if(connection == null) {
				makeConnection();
			}

			return connection;
		}
		
	// The main function here is to just for checking the function as you write code #gp
		public static void main(String[] args) {

			Connection conn = ConnectionManager.getConnection();
			
			//Connection other = SingletonConnectionManager.getConnection();

			// work with connection manipulating database

			try {
				conn.close();
				System.out.println("Connection closed from Singleton class");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}



