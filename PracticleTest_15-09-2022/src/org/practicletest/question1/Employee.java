package org.practicletest.question1;


public class Employee {

	private String name;
	private String joiningdate;
	private String empId;
	
	public Employee(String name, String joiningdate, String empId) {
		super();
		this.name = name;
		this.joiningdate = joiningdate;
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", joiningdate=" + joiningdate + ", empId=" + empId + "]";
	}
	
}
