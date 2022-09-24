package com.locks;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {

		ReentrantLock lock=new ReentrantLock();
		new LockThread("A",lock);
		new LockThread("B", lock);
	}

}
