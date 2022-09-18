package org.practicletest.question3.service;

public class SalaryManagement {

	private int baseSalary;
	public SalaryManagement(int baseSalary) {
		this.baseSalary=baseSalary;
	}

	//Methode Oveloading
	public int add(int salary1, int salary2) {
		return (this.baseSalary+salary2+salary1);
	}
	
	//methode Overloading
	public int add(int salary1, int salary2,int salary3) {
		return (salary3+salary1+salary2+baseSalary);
	}
}
