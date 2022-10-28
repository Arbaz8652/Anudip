package com.emp.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

public class EmployeeView {
	
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String DBUSER = "system";
    public static final String DBPASS = "admin";


    public static void menu(Scanner sc) {
    	boolean status=true;
    	while(status) {
	    	System.out.println("1. new Employee.");
	    	System.out.println("2. all existing Employee.");
	    	System.out.println("3. update Employee");
	    	System.out.println("4. delete Employee");
	    	int choice =sc.nextInt();
	    	switch(choice) {
	    	case 1:
	    		try {
					adddEmp(sc);
				} catch (SQLException e) {e.printStackTrace();}
	    		break;
	    	case 2:
	    		try {
					viewAllEmp();
				} catch (SQLException e) {e.printStackTrace();}
	    		break;
	    	case 3:
	    		try {
					updateEmp(sc);
				} catch (SQLException e1) {	e1.printStackTrace();}
	    		break;
	    	case 4:
	    		try {
					deleteEmp(sc);
				} catch (SQLException e) {e.printStackTrace();}
	    		break;
	    	default:
	    		System.out.println("Invalid choice!");
	    		status=false;
	    	}
    	}
    }
    
    
	private static void deleteEmp(Scanner sc) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS); 
		String empName=sc.nextLine();
		EmployeeService.deletEmpFromDB(con,empName);
		con.close();
	}

	
	private static void updateEmp(Scanner sc) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS); 
        System.out.print("Update (Name) : ");
        String colomn=sc.nextLine();
        sc.nextLine();
        System.out.print("Update to : ");
        String value=sc.nextLine();
        sc.nextLine();
        EmployeeService.update(con, colomn,value);
        con.close();
		
	}

	
	private static void viewAllEmp() throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS); 
        System.out.println(EmployeeService.selectAllEmp(con));
		con.close();
	}

	
	public static void adddEmp(Scanner sc) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS); 
		Employee emp=EmployeeService.getEmpInfo(sc);
		EmployeeService.addEmpToDataBase(emp, con);
		System.out.println("Employee is added to the data base");
		con.close();
		
		
//		Employee emp=new Employee(1, "Ssam", "00000000", "Sam@gmail.com", "Developer", "Bangaluru");
//		System.out.println(EmployeeDAO.createInsertStatement(emp));
	}
}
