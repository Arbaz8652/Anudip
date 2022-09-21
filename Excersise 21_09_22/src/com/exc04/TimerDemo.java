package com.exc04;


import java.time.LocalTime;


public class TimerDemo implements Runnable {

	
	@Override
	public void run() {
		int i=1;
		while(i<31) {
			 i++;
			System.out.println(LocalTime.now());  
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
