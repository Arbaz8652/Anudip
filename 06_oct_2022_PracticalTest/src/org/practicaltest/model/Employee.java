package org.practicaltest.model;

import java.util.Objects;

public class Employee {

	String fname;
	String lname;
	int age;
	int empId;
	public Employee(String fname, String lname, int age, int empId) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.empId = empId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, empId, fname, lname);
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
		return age == other.age && empId == other.empId && Objects.equals(fname, other.fname)
				&& Objects.equals(lname, other.lname);
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", age=" + age + ", empId=" + empId + "]";
	}
	
	
	
	
}
