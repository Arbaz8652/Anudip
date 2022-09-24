package com.atomic_operations;

public class AtomicThread implements Runnable {

	String name;
	
	
	public AtomicThread(String name) {
		super();
		this.name = name;
		new Thread(this).start();
	}


	@Override
	public void run() {
		
		System.out.println("Starting Thread : "+name);

		for(int i=0; i<=3; i++) {
			System.out.println(name+" got : "+SharedCount.count.getAndSet(i));
		}
	}

}
