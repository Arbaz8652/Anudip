package org.practicletest.dao;


import java.util.TreeSet;

import org.practicletest.model.StudentModel;

public class StudentDAO {
	static TreeSet<StudentModel> student=new TreeSet<>();

	public static void addStudent(StudentModel std) {
		student.add(std);
	}
		
	
	
	
	public static StudentModel displayStudent() {
		return student.pollFirst();
	}
	
}
