package com.emp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.emp.model.Employee;

public class EmployeeDAO {
	
	
//	jdbc:sqlserver://localhost:1433;\\ARBAAZPATHAN\\\\SQLEXPRESS;databaseName=EmployeeDeatails;Trusted_Connection=True"
//	private static final String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//	private static final String jdbcURL = "jdbc:sqlserver://Server=ARBAAZPATHAN\\\\SQLEXPRESS;Database=EmployeeDeatails;Trusted_Connection=True";
//	private static final String jdbcURL = "jdbc:sqlserver://localhost:1433;\\SQLEXPRESS;databaseName=EmployeeDeatails;Trusted_Connection=True";
//	
//	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:XE";
//  public static final String DBUSER = "system";
//  public static final String DBPASS = "admin";
//	DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
//	Connection conn = DriverManager.getConnection(jdbcURL);
//	Statement st = conn.createStatement();
//	String statement=createInsertStatement(emp);
//	System.out.println("Adding started");
//	st.execute(statement);
//	System.out.println("Added successfully");
//	conn.close();  
	
	
	
	public static void addEmp(Employee emp, Connection con) throws SQLException {
        Statement statement = con.createStatement();
        statement.executeQuery(createInsertStatement(emp));
	}
	
	
	public static String createInsertStatement(Employee e) {
		 return "INSERT INTO "+"Emp values ("+String.valueOf(e.getId())
		 			+" , '"+e.getName()+"' , '"+e.getPhoneNumber()+"' , '"
		    	    +e.getEmail()+"' , '"+e.getDepartment()+"' , '"
		 			+e.getAddress()+"' )";
	}
	
	
	public static String viewAllEmp(Connection con) {
		Statement st;
		String result="";
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery("Select * From Emp");
			while(rs.next()) {
				result+=rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)
					+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)
					+"\n";
			}	
		} catch (SQLException e) {e.printStackTrace();}
		return result;	
	}
	
	
	public static void deletEmpByName(Connection con, String name) {
		Statement st;
		try {
			st=con.createStatement();
			st.executeQuery("DELETE FROM Emp WHERE EMPNAME='"+name+"'");
			
		} catch (SQLException e) {e.printStackTrace();}	
	}


	public static void updateColomn(Connection con, String colomn, String value) {
		Statement st;
		String q="UPDATE Emp SET EMPNAME = '"+colomn+"' WHERE EMPNAME = '"+value+"'";
		try {
			st=con.createStatement();
			st.executeQuery(q);
		} catch (SQLException e) {e.printStackTrace();}
		
	}
}
