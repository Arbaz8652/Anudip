package com.locks;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable {

	String name;
	ReentrantLock lock;
	
	
	
	
	public LockThread(String name, ReentrantLock lock) {
		super();
		this.name = name;
		this.lock = lock;
		new Thread(this).start();
	}




	@Override
	public void run() {
	
		System.out.println("Starting...");
		System.out.println(name + " is Waaiting to lock Count");
		lock.lock();
		System.out.println(name + " is Locking Count.");
		Shared.count++;
		System.out.println(name+" : "+ Shared.count);
		
		lock.unlock();
		
		
		
	}

}
