package com.charlie.model;

public class User {
int userId;
String username;
String password;
String quoteDomain;
public User(int userId, String username, String password, String quoteDomain) {
	super();
	this.userId = userId;
	this.username = username;
	this.password = password;
	this.quoteDomain = quoteDomain;
}
public User() {
	// TODO Auto-generated constructor stub
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getQuoteDomain() {
	return quoteDomain;
}
public void setQuoteDomain(String quoteDomain) {
	this.quoteDomain = quoteDomain;
}

}
