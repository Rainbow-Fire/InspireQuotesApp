package com.charlie.dao;

import java.sql.Connection;
import java.util.Random; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.charlie.connection.ConnectionManager;
import com.charlie.model.Quotes;

public class dailyQuoteImpl {
	private Connection conn = ConnectionManager.getConnection();
	
	public int getHighID(){
		int highestId = 0;
			try(PreparedStatement pstmt = conn.prepareStatement("select MAX(QuotesId) as QuotesId from Quotes");
					ResultSet rs = pstmt.executeQuery();
				){
				rs.next(); 
					highestId = rs.getInt("QuotesId");
				//System.out.println(highestId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return highestId;
		}
	public void dailyQuote() {
		
		int highestId = getHighID();
		Random rand = new Random(); 
		int randomID = rand.nextInt(highestId)+1;
				
		/*
		 * 1. Select id from quotes
		 * 2. Take highest quoteID
		 * 3. Use Java randomizer (with quote id)
		 * 4. Print Quote,
		 * 5. Wait set amount, (use timer class)
		 * 6. Repeat
		 * 6. Party.
		 */
		
	}
}
