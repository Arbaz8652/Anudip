package com.exc04;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Thread t1=new Thread(new TimerDemo());
		t1.start();
		
	}

}
