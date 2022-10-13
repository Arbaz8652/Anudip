package org.practicaltest.view;

import java.util.Scanner;

import org.practicaltest.exception.InvalidBookException;
import org.practicaltest.model.Book;

public class BookView {

	public Book acceptBookDeatails(Scanner sc) throws InvalidBookException {
		//used
		System.out.println("Enter BookId : ");
		String bookId=sc.next();
		sc.nextLine();
		if(!validateBookId(bookId)) {
			throw new InvalidBookException("Invalid BookId!");
		}
		
	//	System.out.println();
		
		System.out.print("Enter Title : ");
		String tital=sc.nextLine();
	//  System.out.println();
		
		System.out.print("Enter Author Name : ");
		String author=sc.nextLine();
	//  System.out.println();
		
		System.out.print("Enter Book Catagory : ");
		String catagory=sc.nextLine();
		if(!validateCatagory(catagory)) {
			throw new InvalidBookException("Invalid Catagory!");
		}
	//	System.out.println();
		
		System.out.print("Enter Book Price : ");
		double price=sc.nextDouble();
		if(!validateCatagory(price)) {
			throw new InvalidBookException("Invalid Price!");
		}
		return new Book(bookId,tital,author,catagory,price);
		
	}

	
	private boolean validateBookId(String bookId) {
		if(bookId.length()==4 || bookId.charAt(0)=='B') {
			return true;
		}else {
			return false;
		}	
	}


	private boolean validateCatagory(double price) {
		return price<0 ? false : true;
	}


	private boolean validateCatagory(String catagory) {
		switch (catagory) {
		case "Science","Fiction","Technology","Others": {
			return true;
		}
		default:
			return false;
		}
		
	}
}
