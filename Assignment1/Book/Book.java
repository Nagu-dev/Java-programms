package com.assignment.Book;

public class Book {
	private String title;
	private String author;
	private int price;
	private String category;
	public Book(String title, String author, int price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		if(price>500)
		{
			System.out.println("premium books");
		}
		else
		{
			System.out.println("standard books");
		}
		
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString()
	{
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", category=" + category +"]";
	}
}

	

