package com.service;

import java.util.Scanner;

import com.service.Interfaces.Exponentable;
import com.service.Interfaces.Loggable;
import com.service.Interfaces.StringEditable;

public class LamdaExamples {

	public static void exponential(Scanner sc) {
		
		Exponentable ex=new Exponentable() {
			public int x,y;
			@Override
			public void exponent(Scanner sc) {
				System.out.print("Enter First No : ");
				x=sc.nextInt();
				System.out.print("Enter Second No : ");
				y=sc.nextInt();
				System.out.println("X raise to Y = "+ Math.pow(x, y));
			}
		};
		ex.exponent(sc);		
	}
	
	

	public static void formatString(Scanner sc) {
		
		StringEditable sb=new StringEditable() {
			@Override
			public void addSpace(Scanner sc) {
				System.out.print("Enter a String : ");
				String s=sc.nextLine();
				StringBuilder sb=new StringBuilder();
				for(int i=0; i<s.length(); i++) {
					sb.append(s.charAt(i)+" ");
				}
				System.out.println("New String is : "+sb.toString());
			}
		};
		sb.addSpace(sc);	
	}
	
	
	

	public static void login(Scanner sc) {
		Loggable credentials=new Loggable() {
			@Override
			public boolean login(Scanner sc) {
				String userName="Arbaz";
				String PassWord="password";
				System.out.print("Enter User Name : ");
				String u=sc.nextLine();
				System.out.print("Enter Password : ");
				String p=sc.nextLine();
				if(u.equals(userName) && p.equals(PassWord)) {
					return true;
				}else {
					return false;
				}
			}
		};
		if(credentials.login(sc)) {
			System.out.println("Login SuccsessFull!");
		}else {
			System.out.println("Creadentials are Wrong!");
		}
		
	}

}
