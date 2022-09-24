package com.collabledemo;

import java.util.concurrent.Callable;

public class Hypot implements Callable<String> {

	double side1, side2;
	
	Hypot(double side1, Double side2){
		this.side1=side1;
		this.side2=side2;	
	}

	@Override
	public String call(){
		String s=String.valueOf(Math.sqrt((side1*side1)+(side2*side2)))+Thread.currentThread().getName();
		return s;
	}
	
}
