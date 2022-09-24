package com.concurrentcollection.arrayset;

import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentSetDemo extends Thread {

	static CopyOnWriteArraySet<String> set=new CopyOnWriteArraySet<String>();
	
	public void run() {
		System.out.println("Adding by = "+Thread.currentThread().getName() );
		set.add("Z");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Added!");
	}
	
	public static void main(String[] args) {
		set.add("A");
		System.out.println("Adding by = "+Thread.currentThread().getName() );
		set.add("G");
		System.out.println("Adding by = "+Thread.currentThread().getName() );
		set.add("F");
		System.out.println("Adding by = "+Thread.currentThread().getName() );
		set.add("S");
		
		
		ConcurrentSetDemo sd=new ConcurrentSetDemo();
		sd.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(set);
	}
	
}
