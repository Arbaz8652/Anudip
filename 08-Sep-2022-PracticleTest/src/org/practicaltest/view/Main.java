package org.practicaltest.view;
import java.util.Scanner;
import org.practicaltest.model.Employee;

public class Main {
	public static Employee[] empNameStartWithA(Employee[] emp) {
		Employee[] empWithA=new Employee[emp.length];
		for (int i=0; i<emp.length; i++) {
			String name=emp[i].getName();
			char c=name.charAt(0);
			if(c=='A') {
				empWithA[i]=emp[i];
			}
		}
		return empWithA;
	}
	public static void main(String[] args) {
		
		Employee e1=new Employee("Arbaz","104EE2",480);
		Employee e2=new Employee("AhahRukh","104DRE2",420);
		Employee e3=new Employee("Aalman","10RRE2",980);
		Employee e4=new Employee("ZZamir","10YRFE2",380);
		Employee e5=new Employee("Sam","104ZZJS",880);
		Employee[] emp= {e1,e2,e3,e4,e5};
		Employee[] empA=Main.empNameStartWithA(emp);
		for(Employee e: empA) {
			if(e!=null) {
			System.out.println(e.getName()+"\n"+e.getEmpId()+"\n"+e.getSalary());
			System.out.println("==================");
			}
		}
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter");
//	
//		
//
//		
//		sc.close();
		}

}
