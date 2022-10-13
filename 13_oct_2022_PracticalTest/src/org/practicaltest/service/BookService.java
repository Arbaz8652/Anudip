package org.practicaltest.service;

import java.util.Iterator;
import java.util.Scanner;

import org.practicaltest.dao.BookDAO;
import org.practicaltest.exception.InvalidBookException;
import org.practicaltest.model.Book;

import org.practicaltest.view.BookView;

public class BookService {

	//static Scanner sc=new Scanner(System.in);
	
	public static void addBooks(Scanner sc) {
		//Useds
		BookView bw=new BookView();
		for (int i=0; i<2;){
			try {
				Book b1=bw.acceptBookDeatails(sc);
				BookDAO.addSingleBook(b1);
				i++;
			} catch (InvalidBookException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void displayAll() {
		Iterator itr=BookDAO.getAllBooks().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}
	
	public static void searchByTitle(String title) {
		Book b=BookDAO.searchTitle(title);
		if(b!=null){
			System.out.println(b.toString());
		}else {
			System.out.println("Book N Found !");
		}
	}
	
	public static void searchByAuthor(String author) {
		Book b=BookDAO.searchTitle(author);
		if(b!=null){
			System.out.println(b.toString());
		}else {
			System.out.println("Book Not Found !");
		}
	}
}
