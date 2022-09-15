package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FIleReadder {

	public static void main(String[] args) throws IOException {
		

//		while(br.readLine()==null) {
//			System.out.println(br.readLine());
//		}
		BufferedReader reader = new BufferedReader(new FileReader("TextDoc.txt"));
		String line = null;
		int n=1;
		while ((line = reader.readLine()) != null) {
			System.out.println(n+"). "+line);
			n++;
		}
		reader.close();
		
	}

}
