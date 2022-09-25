package org.practicletest.service;

import org.practicletest.dao.StudentDAO;
import org.practicletest.model.StudentModel;

public class StudentService {

	//call to Add Student
	public static void storeDeatails(StudentModel student) {
		StudentDAO.addStudent(student);
	}
	
	
	//call to Display Student
	public static StudentModel printStudents() {
		return StudentDAO.displayStudent();
	}

}
