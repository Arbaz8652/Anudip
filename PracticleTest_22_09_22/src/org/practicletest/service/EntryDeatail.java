package org.practicletest.service;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeSet;

import org.practicletest.model.Student;


public class EntryDeatail {

	public static void storeDeatails(String name,String depart, String date,TreeSet<Student> stdInfo) {
		
		
		LocalDate dop = LocalDate.parse(date);
		
        Student student=new Student(name,depart,dop);
        
		stdInfo.add(student);
		System.out.println("Student is Added Successfully..!");
		System.out.println("================================");
		
		
	}
	
	public static void printStudents(TreeSet<Student> ts) {
		Iterator<Student> itr=ts.iterator();
		Student s=null;
		try {
		while ((s=itr.next())!=null) {
			System.out.println(s);
		}
		}catch(NoSuchElementException e) {
			System.out.println("Done");
		}
	}
	
}
