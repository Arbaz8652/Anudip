package view;

import service.*;

public class Main {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		
		System.out.println(calc.calculateSum(50));
		
		System.out.println(calc.calculateDifference(25));
		
		System.out.println(calc.checkpowOfTwo(128));
		
		System.out.println(calc.checkIncreasing(36890));
		
		
		
		
		
		
		
		
		
//		CalculateSum cs=new CalculateSum();
//		System.out.println(cs.calculateSum(56));
//		
//		CalculateDiff cd=new CalculateDiff();
//		System.out.println(cd.calculateDifference(35));
//		
//		CheckNumber cn=new CheckNumber();
//		System.out.println(cn.checkPowOfTwo(2048));
//		System.out.println(cn.checkIncreasing(56789));
	}
}
