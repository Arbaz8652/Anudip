package com.synchronisation_objectProducerConsumer;

public class Consumer implements Runnable{

	Q q;
	public Consumer(Q q) {
		this.q=q;
		new Thread(this,"Consumer").start(); 
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			q.get(i);
		}
		
	}

}
