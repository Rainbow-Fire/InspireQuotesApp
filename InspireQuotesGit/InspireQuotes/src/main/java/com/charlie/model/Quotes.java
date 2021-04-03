package com.charlie.model;

public class Quotes {
int quotesId;
String quote;
String author;
String domain;
public Quotes(int quotesId, String quote, String author, String domain) {
	super();
	this.quotesId = quotesId;
	this.quote = quote;
	this.author = author;
	this.domain = domain;
}
public int getQuotesId() {
	return quotesId;
}
public void setQuotesId(int quotesId) {
	this.quotesId = quotesId;
}
public String getQuote() {
	return quote;
}
public void setQuote(String quote) {
	this.quote = quote;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}

}
