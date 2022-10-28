package com.emp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.emp.dao.EmployeeDAO;
import com.emp.model.Employee;

public class EmployeeService {
	public static Employee getEmpInfo(Scanner sc) {
		System.out.println("Enter Id : ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name : ");
		String name=sc.nextLine();
		System.out.print("Enter Address : ");
		String address=sc.nextLine();
		System.out.print("Enter Email Id : ");
		String email=sc.nextLine();
		System.out.print("Enter Contact : ");
		String contact=sc.nextLine();
		System.out.print("Enter department : ");
		String department=sc.nextLine();
		return createEmp(id,name,address,email,contact,department);
	
	}

    private static Employee createEmp(int id, String name, String address, String email, String contact, String department) {
    	return new Employee(id, name, contact, email, department, address);
    }
    public static void addEmpToDataBase(Employee emp,Connection con) throws SQLException {
    	EmployeeDAO.addEmp(emp,con);
    }

    
	public static String selectAllEmp(Connection con) {
		return EmployeeDAO.viewAllEmp(con);
		
	}

	public static void deletEmpFromDB(Connection con, String name) {
		EmployeeDAO.deletEmpByName(con, name);
		
	}

	public static void update(Connection con, String colomn, String value) {
		EmployeeDAO.updateColomn(con,colomn, value);
		
	}
    
    
}
