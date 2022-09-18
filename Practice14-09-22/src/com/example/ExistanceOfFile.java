package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ileReader {

	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Complete name of File.");
		String fileName=sc.nextLine();
		String extension=null;
		String readable=null;
		String re=null;
		StringTokenizer st=new StringTokenizer(fileName,".");
		while(st.hasMoreElements()) {
			extension=st.nextToken();
		}
		if (extension=="class") {
			re="Not readable.";
			readable="No Writable";
		}else {
			readable="readable";
			re="Writable";
		}
		
		try {
			BufferedReader read = new BufferedReader(new FileReader(fileName));
			String str=null;
			StringBuilder strbild=new StringBuilder();
			while((str=read.readLine())!=null) {
				strbild.append(str);
			}
			System.out.println("File Name : "+fileName+
					"\nSize      : "+
					(strbild.length()*4)+
					" bytes\nFile status : "+readable+" and "+re+"\nType OF File is : "+
					extension);
			read.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Fount!");
		}
		sc.close();
	}

}
