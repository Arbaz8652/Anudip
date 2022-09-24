package com.synchronisation_objectProducerConsumer;

import java.util.concurrent.Semaphore;

public class Q{

	int n;
	static Semaphore semCon=new Semaphore(0);
	static Semaphore semPro=new Semaphore(1);
	
	
	public void put(int n) {
		
		try {
			semPro.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Put : "+n);
		semCon.release();
		
	}

	public void get(int n) {
		try {
			semCon.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Get : "+n);
		semPro.release();
		
	}

}
