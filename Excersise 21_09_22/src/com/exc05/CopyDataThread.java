package com.exc05;


import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDataThread implements Runnable{
	private RandomAccessFile rm;
	private RandomAccessFile wm;
	

	public CopyDataThread(RandomAccessFile rm, RandomAccessFile wm) {
		super();
		this.rm = rm;
		this.wm = wm;
	}

	@Override
	public void run() {
		String s=null;
		String s1="";
		try {
			while((s1=rm.readLine())!=null) {
				s+=s1;
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int i=0;
		while(i<s.length()) {
			i++;
			if(i>=s.length()) {
				break;
			}
			char c=s.charAt(i);
			try {
				wm.writeChar((int)c);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(i%10==0) {
				try {
					Thread.sleep(1000);
					System.out.println("Ten Characters are Copied");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		try {
			rm.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			wm.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("============================");
		System.out.println("File Writting Complleted!");
		System.out.println("============================");
		
	}
	
	
}
