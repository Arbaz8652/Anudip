package org.practicaltest.service;


import org.practicaltest.dao.EmployeeDAO;
import org.practicaltest.model.Employee;

public class EmployeeService {
	
	//Adding Employee in EmployeeDAO   (HashSet)
	public static void addEmployeeToDao(Employee e) {
		EmployeeDAO.employees.add(e);	
	}
		

//	public static void addEmployee(Scanner sc) {
//		
//		System.out.print("Enter Employee FirstName : "); String fname=sc.next();
//		System.out.println();
//		System.out.print("Enter Employee LastName : "); String lname=sc.next();
//		System.out.println();
//		System.out.print("Enter Employee age : "); int age=sc.nextInt();
//		System.out.println();
//		System.out.print("Enter Employee Id : "); int empId=sc.nextInt();
//		System.out.println();
//		Employee e=new Employee(fname, lname, age, empId);
//		EmployeeDAO.employees.add(e);
//		
//	}
	
	
}
