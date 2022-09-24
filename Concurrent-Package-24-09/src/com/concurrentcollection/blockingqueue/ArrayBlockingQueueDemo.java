package com.concurrentcollection.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDemo {

	public static void main(String[] args) {
		int capacity = 15;
		
		ArrayBlockingQueue<Integer> bq=new ArrayBlockingQueue<>(capacity);
	
		System.out.println(bq);
		System.out.println(bq.poll());
//		try {
//			System.out.println(bq.poll());
//		} catch (IllegalStateException e) {
//			e.printStackTrace();
//		}
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
		
		bq.add(1);
		bq.add(3);
		bq.add(14);
		bq.add(12);
		bq.add(13);
//		System.out.println(bq.poll());
//		System.out.println(bq.poll());
		bq.add(3);
		bq.add(5);
		bq.add(8);
		bq.add(0);
		bq.add(21);
		bq.add(156);
		bq.add(87);
		bq.add(109);
		bq.add(109);
		bq.add(109);
		
//		try {
//			System.out.println(bq.take());
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		try {
		bq.add(109);
		}catch (IllegalStateException e) {
			e.printStackTrace();
		}
		System.out.println(bq.size());
		System.out.println(bq);

	}
}
