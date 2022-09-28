package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeRepository {
	public static List<Employee> emp=new ArrayList<>();
	public static void addEmployee(Employee empl) {
		emp.add(empl);
	}
	public static Employee getEmployee(int i) {
		return emp.get(i);
	}
}
	
//	public static List<Department> depart=new ArrayList<>();
//	public static List<Department> getDepartment() {
//		return depart;
//	}
//	public static void addDepartment(Department department) {
//		depart.add(department);
//	}
	
	
	
