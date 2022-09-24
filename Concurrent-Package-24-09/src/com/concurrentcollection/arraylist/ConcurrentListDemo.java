package com.concurrentcollection.arraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentListDemo extends Thread {

	static CopyOnWriteArrayList<String> i=new CopyOnWriteArrayList<String>();
	
	public void run() {
		i.add("E");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		i.add("X");
		i.add("C");
		i.add("D");
		
		ConcurrentListDemo cd=new ConcurrentListDemo();
		cd.run(); 	
		
		Thread.sleep(1000);
		
		Iterator<String> itr=i.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(i);
	}
}
