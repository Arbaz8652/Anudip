package org.practicaltest.dao;


import java.util.ArrayList;
import java.util.List;


import org.practicaltest.model.Book;

public class BookDAO {
	public static List<Book> book=new ArrayList<>();

	public static void addtemp() {
		Book b=new Book( "Sama", "PaleDot", "Arbaz", "Science", 34.6);
		Book b1=new Book( "Bma2", "Don", "Ham", "Fiction", 34.6);
		book.add(b);
		book.add(b1);
	}
	
	public static List<Book> getAllBooks() {
		return book;
	}
		
	public static Book getSingleBook(int index) {
		return book.get(index);
	}

	public static void addSingleBook(Book book) {
		BookDAO.book.add(book);
	}
	
	public static Book searchTitle(String title) {
		for(Book b:book) {
			if (b.getTitle().toString().equals(title)) {
				return b;
			}
		}
		return null;
	}
	
	public static Book searchAuthor(String author) {
		for(Book b:book) {
			if (b.getAuthor().equals(author)) {
				return b;
			}
		}
		return null;
	}

	
	
	
	
}
