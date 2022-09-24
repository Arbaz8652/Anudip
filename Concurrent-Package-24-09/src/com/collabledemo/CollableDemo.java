package com.collabledemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CollableDemo {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(3);
		Future<String> f;
		Future<String> f2;
		Future<String> f3;
		
		System.out.println("Starting...");
		
		f=es.submit(new Sum(10));
		f2=es.submit(new Hypot(12.3, 15.3));
		f3=es.submit(new Factorial(10));
		
		
		try {
			System.out.println(f.get());
			System.out.println(f2.get());
			System.out.println(f3.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		es.shutdown();
		System.out.println("Done!");
		
	}
}
