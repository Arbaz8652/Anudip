package org.practicletest.main;

import java.util.Iterator;
import java.util.Scanner;

import org.practicaltest.dao.EmployeeDAO;
import org.practicaltest.model.Employee;
import org.practicaltest.view.DepartmentView;
import org.practicaltest.view.EmployeeView;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Employees are There");
		int l=sc.nextInt();
		for(int i=0; i<l; i++) {
			System.out.println("Enter Deatails of "+(i+1)+" Employee");
			EmployeeView.takeEmployeedeatails(sc);
			DepartmentView.TakeDepartmentDeatails(sc);
			System.out.println("================");
		}
		Iterator<Employee> iemp=EmployeeDAO.employees.iterator();
		while (iemp.hasNext()) {
			System.out.println(iemp.next().toString());
			
		}
		
		EmployeeView.printAllEmployee();
		System.out.println("=====================");
		DepartmentView.printAllDepartment();
		System.out.println("=====================");
		
		
	}

}
