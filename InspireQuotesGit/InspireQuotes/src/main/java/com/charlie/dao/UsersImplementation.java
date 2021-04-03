package com.charlie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.charlie.connection.ConnectionManager;
import com.charlie.model.Quotes;

public class UsersImplementation {
	private Connection conn = ConnectionManager.getConnection();
	public Boolean isSignedIn(String enteredUsername, String enteredPassword) {
		Boolean result = false;
		try{
			PreparedStatement pstmt = conn.prepareStatement("select Username, Password from Users where Username = ? ");
				pstmt.setString(1, enteredUsername);
				ResultSet rs = pstmt.executeQuery();
				
			rs.next();
			String dataBaseUsername = rs.getString("Username");
			String dataBasePassword = rs.getString("Password");
			System.out.println(dataBasePassword+ dataBaseUsername);
			if (dataBaseUsername.equals(enteredUsername) && dataBasePassword.equals(enteredPassword)){
				System.out.println("Username and Password match, singing in.");
				result = true;
			
			}
			else {
				System.out.println("Password Incorrect");
				result = false;
			}
		}
	 catch (SQLException e) {
		// TODO Auto-generated catch block
		 System.out.println("Error Code 555");
		e.printStackTrace();
	}
		return result;
	
}
	public Boolean signUp(String newEnteredUser, String newEnteredPass) {
		Boolean isSignedUp = false;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("select Username From Users");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String dataBaseUsername = rs.getString("Username");
				if (dataBaseUsername == newEnteredUser) {
					return isSignedUp;
				}

		}
		    pstmt = conn.prepareStatement("INSERT INTO Users VALUES (Null, ?, ?, Null); ");
			pstmt.setString(1, newEnteredUser);
			pstmt.setString(2, newEnteredPass);
			pstmt.executeUpdate();
			isSignedUp = true;
			System.out.println("Signed Up Successfully!");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			 System.out.println("Error Code SignUpError");
			e.printStackTrace();
		}
		
		return isSignedUp;
		
	}
}
