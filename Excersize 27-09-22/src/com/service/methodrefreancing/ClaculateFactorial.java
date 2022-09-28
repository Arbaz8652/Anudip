package com.service.methodrefreancing;

public class ClaculateFactorial {

	public static int fact(int n) {
		int sum=1;
		for(int i=n; i>0 ; i--) {
			sum=sum*i;
		}
		return sum;
	}
	
}
