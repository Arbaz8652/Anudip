package com.exc05;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileProgram {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rm=new RandomAccessFile("Source.txt", "r");
		RandomAccessFile wm=new RandomAccessFile("Target.txt", "rw");
		
//		String s=null;
//		String s1="";
//		try {
//			while((s1=rm.readLine())!=null) {
//				s+=s1;
//			}
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		System.out.println(s);
		
//		System.out.println(rm.readLine());
		CopyDataThread cp=new CopyDataThread(rm, wm);
		Thread t=new Thread(cp);
		t.start();
		
		
	}

}
	