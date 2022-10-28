package com.emp.main;


import java.util.Scanner;

import com.emp.view.EmployeeView;


public class Main {   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeView.menu(sc);
		sc.close();
	}
}
