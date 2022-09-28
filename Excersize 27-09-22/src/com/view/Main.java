package com.view;


import java.util.Scanner;

import com.methodrefreancing.ClaculateFactorial;
import com.methodrefreancing.Student;
import com.methodrefreancing.Interface.Arithmatics;
import com.methodrefreancing.Interface.Sayable;
import com.service.EmployeeService;
import com.service.LamdaExamples;

public class Main {

	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		//Question 1 x raise to y
		LamdaExamples.exponential(sc);
		
		
		//Question 2 
		LamdaExamples.formatString(sc);
		
		
		//Question 3
		LamdaExamples.login(sc);
		sc.close();
		
		//Question 4
		//non-static ,method refrancing.
		Sayable sy=new Student("Akash","khan",21)::sayHelloTo;
		sy.sayHello();
		
		Sayable sy1=Student::sayHelloToeveryone;
		sy1.sayHello();
		
		//Question 5
		Arithmatics a=ClaculateFactorial::fact;
		System.out.println(a.factorial(4));
		
/*		
		
		
		===============================================
				EMPLOYEE AND DEPARTMENTS
		===============================================
*/
		
		
		EmployeeService.addEmployee();
		
		System.out.println("Get Employee Without any department");
		EmployeeService.empWithoutDepartment();
		System.out.println();

//		System.out.println("Println Departments");
//		EmployeeService.printDepartment();
//		System.out.println();

		
		System.out.println("Total Working Cost To the Company.");
		EmployeeService.sumOfSalary();
		System.out.println();

		System.out.println("End Date and Duration");
		EmployeeService.empAndDuration();
		System.out.println();

		System.out.println("Name and Amount of TIme that the employee has Completed in the Company");
		EmployeeService.nameDojDay();
		System.out.println();
		
		System.out.println("Promotion and salary Raise Deatails");
		EmployeeService.promotion();
		System.out.println();
		
		System.out.println("Sort Employee by there email id");
		EmployeeService.sortEmpByEmail();
		System.out.println();
		
		System.out.println("Sort Employee by there Department id");
		EmployeeService.sortEmpByDId();
		System.out.println();
		
		System.out.println("Sort Employee by there First Name");
		EmployeeService.sortEmpByFName();
		System.out.println();
		
		System.out.println(" Employee Who Didnt report To anyone");
		EmployeeService.empWithoutManager();
		System.out.println();
		
		
		//EmployeeService.printEmp();
		

	}
}
