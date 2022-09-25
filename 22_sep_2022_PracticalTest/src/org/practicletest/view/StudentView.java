package org.practicletest.view;

import java.time.LocalDate;
import java.util.Scanner;

import org.practicletest.model.StudentModel;

import org.practicletest.service.StudentService;

public class StudentView {

	static String name;
	static String department;

	static String date;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter Deatails : Name,Department,RollNumber");
		for (int i=1; i<=2; i++) {
			System.out.println(i+"). Name :");
			name=sc.nextLine();
			System.out.println(i+"). Department :");
			department=sc.nextLine();
			System.out.println(i+"). Dop in YYYY-MM-DD format :");
			date=sc.nextLine();
			LocalDate dop = LocalDate.parse(date);
			StudentModel student=new StudentModel(name,department,dop);
			StudentService.storeDeatails(student);
			
		}
		for(int i=0; i<2; i++) {
			StudentModel s=StudentService.printStudents();
			System.out.println(s.toString());
		}
		sc.close();
		
	}
}
