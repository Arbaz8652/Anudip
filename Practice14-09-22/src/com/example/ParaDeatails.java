package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ParaDeatails {

	public static int wordCounter(String str) {
		StringTokenizer st=new StringTokenizer(str," ");
		int n=0;
		while(st.hasMoreElements()) {
			if(st.nextToken()!=null) {
				n++;
			}else {
				return n;
			}
		}
		return n;
	}
	
	
	
	public static int charCounter(String str) {
		return str.length();
	}
	
	
	
	public static int lineCounter() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("TextDoc.txt"));
		int n=0;		
		while (read.readLine() != null) {
			n++;
		}
		read.close();
		return n;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("TextDoc.txt"));
		String str=null;
		StringBuilder strbild=new StringBuilder();
		while((str=read.readLine())!=null) {
			strbild.append(str);
		}
		str=String.valueOf(strbild);
		System.out.println(charCounter(str));
		System.out.println(wordCounter(str));
		System.out.println(lineCounter());
		read.close();
	}
}
