package com.techlabs.model;

public class Book {
	private int bookId;
	private String name;
	private String author;
	private double price;
	private String publication;
	
	public Book() {
		
		//default constructor
	}
	
	//parameterized constructor
	public Book(int bookId, String name, String author, double price, String publication) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publication = publication;
	}
	
	//Book ID
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	//Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Author
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//Price
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//Publication
		public String getPublication() {
			return publication;
		}
		public void setPublication(String publication) {
			this.publication = publication;
		}
		
		public void getInfo() {
			
		}
		
		 public static Book[] sortedBooksPrice(Book[] prices) {
			  Book lowprice = prices[0];
			  //lowprice = prices[0].getPrice();
			  if(prices.length==0) {
			   return null;
			  }
			  else {
			   for(Book price: prices) {
			    if(lowprice.getPrice() > price.getPrice()) {
			     lowprice = price;
			    }
			   }
			   
			  }
			  return prices;
			 }
		
}
