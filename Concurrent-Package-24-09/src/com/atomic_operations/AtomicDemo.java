package com.atomic_operations;

public class AtomicDemo {

	public static void main(String[] args) {
		new AtomicThread("A");
		new AtomicThread("B");
		new AtomicThread("C");
	}
}
