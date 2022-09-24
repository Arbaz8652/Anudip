package com.synchronisation_object;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

	public static void main(String[] args) {
		
		Semaphore sp=new Semaphore(1);
		new IncThread("A",sp);
		new DecThread("B",sp);
		
		System.out.println(Shared.count);
		
		
	}
}


