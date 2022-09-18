package org.practicletest.question3;

public class Employee {
	private String name;
	private String empId;
	private double salary;
	
	public Employee(){
		
	}
	public Employee(String name, String empId, double salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setempId(String empId) {
		this.empId=empId;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return empId+" "+name+" "+salary;
	}
	
	
}
