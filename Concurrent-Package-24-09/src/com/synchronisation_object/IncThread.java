package com.synchronisation_object;

import java.util.concurrent.Semaphore;

public class IncThread implements Runnable {

	String name;
	Semaphore sem;
	
	
	public IncThread(String name, Semaphore sem) {
		super();
		this.name = name;
		this.sem=sem;
		new Thread(this).start();
	}
		
	@Override
	public void run() {
		
		try {
			System.out.println(name+" IS Waiting for a permit.");
			sem.acquire();
			System.out.println(name+" Gets a permit.");
			
			for (int i=0; i<5; i++) {
				Shared.count++;
				System.out.println(name+" : "+Shared.count);
				
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+": release the permit.");
		sem.release();

	}

}
