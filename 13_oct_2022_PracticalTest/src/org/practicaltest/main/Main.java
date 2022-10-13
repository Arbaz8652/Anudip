package org.practicaltest.main;

import java.util.Scanner;

import org.practicaltest.dao.BookDAO;
import org.practicaltest.service.BookService;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BookDAO.addtemp();
		while(true) {
			System.out.println("Enter \n1). Enter Books\n"
					+ "2). Search the Book By Tital\n"
					+ "3). Search th Book By Author\n"
					+ "4). Display All The Book Deatails");
			int choice=sc.nextInt();
			selectedChoice(choice,sc);
		}
		

	}
	
	static void selectedChoice(int choice,Scanner sc) {
		String title;
		switch (choice) {
		case 1: {
			BookService.addBooks(sc);
		}
		case 2:{
			title=sc.next();
			sc.nextLine();
			BookService.searchByTitle(title);
		}
		case 3:{
			String author=sc.nextLine();
			BookService.searchByAuthor(author);
		}
		case 4:{
			BookService.displayAll();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice + "Try Again!");
		}
	}

}
