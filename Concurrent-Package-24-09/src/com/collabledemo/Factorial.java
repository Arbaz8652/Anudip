package com.collabledemo;

import java.util.concurrent.Callable;

public class Factorial implements Callable<String> {

	int stop;
	public Factorial(int stop) {
		this.stop=stop;
	}
	
	
	@Override
	public String call(){
		int fact=1;
		for(int i=2; i<=stop; i++) {
			fact*=i;
		}
		String s = String.valueOf(fact)+Thread.currentThread().getName();
		return s;
	}

}
