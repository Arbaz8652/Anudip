package org.practicletest.question3.view;
import org.practicletest.question3.model.AutoRikshaw;
import org.practicletest.question3.model.Car;
import org.practicletest.question3.model.Employee;
import org.practicletest.question3.model.Truck;
import org.practicletest.question3.service.SalaryManagement;

public class Main {
	
	
	public static void main(String[] args) {
		// Constructor Overloading
		Employee emp1=new Employee("Tony Stark");
		System.out.println(emp1.toString());
		
		Employee emp2=new Employee("Tony Stark","xae12");
		System.out.println(emp2.toString());
		
		Employee emp3=new Employee("Tony Stark","xae12",340000);
		System.out.println(emp3.toString());
		
		
		System.out.println();
		System.out.println("=================================");
		System.out.println();
		
		
		//Methode Overloading                   baseSalary.
		SalaryManagement sm=new SalaryManagement(10000);
		int salary=0;
		salary=sm.add(15000,25000);
		System.out.println(salary);
		
		salary=sm.add(15000,25000,30000);
		System.out.println(salary);
		
		
		System.out.println();
		System.out.println("=================================");
		System.out.println();
		
		
		Car audi=new Car(4, "Petrol");
		System.out.println(audi.getName());
		audi.Fuel();
		audi.hasWheels();
		System.out.println(audi.toString());
		Truck tata=new Truck(18, "Diesel");
		System.out.println(tata.getName());
		tata.Fuel();
		tata.hasWheels();
		System.out.println(tata.toString());
		AutoRikshaw auto=new AutoRikshaw(3, "CNG");
		System.out.println(auto.getName());
		auto.Fuel();
		auto.hasWheels();
		System.out.println(auto.toString());
		
		
	}

}
