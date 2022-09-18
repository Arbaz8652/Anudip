package org.practicletest.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Deatails in this Format.\n<Name>\" \" <Id>\" \" <Joining Date> ");
		Employee[] emp = new Employee[5];
		String[] arr;
		
		for( int i=0; i<5; i++) {
			String deatail=sc.nextLine();
			arr=deatail.split(" ");
			emp[i]=new Employee(arr[0], arr[1], arr[2]);
		
		}	
		sc.close();
		

	}

}
