package org.practicaltest.view;

import java.util.Iterator;
import java.util.Scanner;

import org.practicaltest.dao.DepartmentDAO;
import org.practicaltest.model.Department;
import org.practicaltest.service.DepartmentService;

public class DepartmentView {
	public static void TakeDepartmentDeatails(Scanner sc) {
		
		System.out.print("Enter Department Name : "); String departmentName=sc.next();
		System.out.print("Enter Department Id : "); int departmentId=sc.nextInt();
		Department d=new Department(departmentName,departmentId);
		DepartmentService.addDepartmentToDao(d);
		
	}
	
	public static void printAllDepartment() {
		Iterator<Department> itrEmp=DepartmentDAO.departments.iterator();
		while(itrEmp.hasNext()) {
			System.out.println(itrEmp.next().toString());
		}
	}

}
