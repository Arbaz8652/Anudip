package com.collabledemo;

import java.util.concurrent.Callable;

public class Sum implements Callable<String> {
	int s;
	public Sum(int s) {
		this.s=s;
	}
	
	@Override
	public String call() {
		int sum=0;
		for (int i=0; i<=s; i++) {
			sum+=i;
		}
		String s = String.valueOf(sum)+Thread.currentThread().getName();

		return s;
	}

}
