package com.methodrefreancing;

import com.methodrefreancing.Interface.Sayable;

public class Student {

	 String fname;
	 String lname;
	 int age;
	public Student(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	
	public void sayHelloTo() {
		System.out.println("Hello Mr."+fname+" "+lname+".\nYou are "+age+" years old.");		
	}
	
	public static void sayHelloToeveryone() {
		System.out.println("Hello everyone!");
	}
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
