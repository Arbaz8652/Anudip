package org.practicletest.view;

import java.util.Scanner;
import java.util.TreeSet;

import org.practicletest.service.EntryDeatail;

public class StudentView {

	static String name;
	static String department;

	static String dop;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		TreeSet<org.practicletest.model.Student> studentdeatails=new TreeSet<>();
		
		System.out.println("Enter Deatails : Name,Department,RollNumber");
		for (int i=1; i<=2; i++) {
			System.out.println(i+"). Name :");
			name=sc.nextLine();
			System.out.println(i+"). Department :");
			department=sc.nextLine();
			System.out.println(i+"). Dop in YYYY-MM-DD format :");
			dop=sc.nextLine();
			EntryDeatail.storeDeatails(name,department,dop, studentdeatails);
			
		}
		EntryDeatail.printStudents(studentdeatails);
		sc.close();
		
	}
}
