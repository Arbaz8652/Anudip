package org.practicletest.question3.model;

import java.util.Objects;

public class Employee {
	private String name;
	private String empId;
	private double salary;
	
	public Employee(){
		
	}
	//Costructor Overloading
	public Employee(String name, String empId, double salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	//Constructor OverLoading;
	public Employee(String name, String empId) {
		this.name=name;
		this.empId=empId;
	}
	//Constructor Overloading
	public Employee(String name) {
		this.name=name;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(empId, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empId, other.empId) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
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
