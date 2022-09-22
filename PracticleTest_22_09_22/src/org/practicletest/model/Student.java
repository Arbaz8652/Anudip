package org.practicletest.model;

import java.time.LocalDate;

public class Student implements Comparable<Student> {

	private String name;
	private String department;
	private LocalDate dop;
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}

	
	public LocalDate getDop() {
		return dop;
	}
	public Student(String name, String department, LocalDate dop) {
		super();
		this.name = name;
		this.department = department;
		this.dop = dop;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", department=" + department + ", dop=" + dop
				+ "]";
	}
	@Override
	public int compareTo(Student s) {
		String scurrent=this.getName();
		String sprev=s.getName();
		int com=scurrent.compareTo(sprev);
		return com;
		
	}

	
}
