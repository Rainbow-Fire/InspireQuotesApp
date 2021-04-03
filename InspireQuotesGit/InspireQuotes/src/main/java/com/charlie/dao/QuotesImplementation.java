package com.charlie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.charlie.model.*;
import com.charlie.connection.ConnectionManager;

public class QuotesImplementation {
	private Connection conn = ConnectionManager.getConnection();
	
	public List<Quotes> getAllQuotes(){
		List<Quotes> quoteresult = new ArrayList<Quotes>();
			try(PreparedStatement pstmt = conn.prepareStatement("select * from Quotes");
					ResultSet rs = pstmt.executeQuery();
				){
				while(rs.next()) {
					int quotesId = rs.getInt("QuotesId");
					String quote = rs.getString("Quote");
					String author = rs.getString("Author");
					String domain = rs.getString("Domain");
					
					 Quotes quotes = new Quotes(quotesId, quote, author, domain);
					    quoteresult.add(quotes);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return quoteresult;
	}
	
	public List<Quotes> getCodingDomain(){
		List<Quotes> quoteresult = new ArrayList<Quotes>();
			try(PreparedStatement pstmt = conn.prepareStatement("Select * from Quotes where Domain = 'Coding'");
					ResultSet rs = pstmt.executeQuery();
				){
				while(rs.next()) {
					int quotesId = rs.getInt("QuotesId");
					String quote = rs.getString("Quote");
					String author = rs.getString("Author");
					String domain = rs.getString("Domain");
					
					 Quotes quotes = new Quotes(quotesId, quote, author, domain);
					    quoteresult.add(quotes);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return quoteresult;
	}
	
	public List<Quotes> getPSDomain(){
		List<Quotes> quoteresult = new ArrayList<Quotes>();
			try(PreparedStatement pstmt = conn.prepareStatement("Select * from Quotes where Domain = 'Personal Success'");
					ResultSet rs = pstmt.executeQuery();
				){
				while(rs.next()) {
					int quotesId = rs.getInt("QuotesId");
					String quote = rs.getString("Quote");
					String author = rs.getString("Author");
					String domain = rs.getString("Domain");
					
					 Quotes quotes = new Quotes(quotesId, quote, author, domain);
					    quoteresult.add(quotes);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return quoteresult;
	}
	public List<String> getQuoteByID(int randomID) {
		List<String> dailyquote = new ArrayList<String>();
		try{
			PreparedStatement pstmt = conn.prepareStatement("select * from Quotes where QuotesId = ? ");
				pstmt.setInt(1, randomID);
				ResultSet rs = pstmt.executeQuery();
				
			while(rs.next()) {
			String daily1 = rs.getString("Quote");
			String quote2 = rs.getString("Domain");
			dailyquote.add(daily1);
			dailyquote.add(quote2);
			}
			
		}
	 catch (SQLException e) {
		// TODO Auto-generated catch block
		 System.out.println("Error Code 555");
		e.printStackTrace();
	}
		return dailyquote;
	
}
}
