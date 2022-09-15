package com.example;

import java.util.StringTokenizer;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Space Seperated Integers.");
		String strOfInt=sc.nextLine();
		StringTokenizer st=new StringTokenizer(strOfInt," ");
		int sum=0;
		while(st.hasMoreElements()) {
			sum+=(int)Integer.parseInt(st.nextToken());
		}
		System.out.println("Sum of integers is : "+sum);
		sc.close();
		
	}
}
