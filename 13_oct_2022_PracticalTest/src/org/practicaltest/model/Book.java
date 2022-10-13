package org.practicaltest.model;

import java.util.Objects;

public class Book {

	String bookId;
	String title;
	String author;
	String catagory;
	double price;
	public Book() {
		
	}
	public Book(String bookId, String title, String author, String catagory, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.catagory = catagory;
		this.price = price;
	}
	
	public String getBookId() {
		return this.bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getCatagory() {
		return this.catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", catagory=" + catagory
				+ ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, catagory, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bookId, other.bookId)
				&& Objects.equals(catagory, other.catagory)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}
	

	
	
}
