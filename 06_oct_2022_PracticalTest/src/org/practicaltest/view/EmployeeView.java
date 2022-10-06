package org.practicaltest.view;

import java.util.Iterator;
import java.util.Scanner;

import org.practicaltest.dao.EmployeeDAO;
import org.practicaltest.model.Employee;
import org.practicaltest.service.EmployeeService;

public class EmployeeView {

	public static void takeEmployeedeatails(Scanner sc) {
	
		System.out.print("Enter Employee FirstName : "); String fname=sc.next();
		System.out.print("Enter Employee LastName : "); String lname=sc.next();
		System.out.print("Enter Employee age : "); int age=sc.nextInt();
		System.out.print("Enter Employee Id : "); int empId=sc.nextInt();
		Employee e=new Employee(fname, lname, age, empId);
		EmployeeService.addEmployeeToDao(e);
	
	}
	public static void printAllEmployee() {
		Iterator<Employee> itrEmp=EmployeeDAO.employees.iterator();
		//while(itrEmp.hasNext()) {
			System.out.println(itrEmp.next().toString());
		//}
	}

}
