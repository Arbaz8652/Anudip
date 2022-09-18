package com.startravels.main;

import java.util.Scanner;

import com.startravels.busmodel.BusDeatails;
import com.startravels.busmodel.BusType;
import com.startravels.route.BusRoute;

public class Main {
	
	static Scanner sc=new Scanner(System.in);
	
	public static BusRoute getroute() {
//		System.out.println("Enter BusID :-");
//		int bid=sc.nextInt();
//		sc.nextLine();
		System.out.println("==================Please Enter=======================");

		System.out.println("Enter Route Id :-");
		int rid=sc.nextInt();	
		sc.nextLine();
		System.out.println("Enter Starting point :-");
		String start=sc.next();
		sc.nextLine();
		System.out.println("Enter Destination :-");
		String destination = sc.next();
		sc.nextLine();
		BusRoute br= new BusRoute(rid,start,destination); 
		System.out.println("================================================");

		 return br;
	}
	
	public static BusDeatails getBus() {
		System.out.println("================================================");

		System.out.println("Enter BusID :-");
		int bid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Bus no :-");
		String rid=sc.next();	
		sc.nextLine();
		System.out.println("Enter number of seats :-");
		int seats=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Type {SLEEPERAC, SLEEPERNONAC, NONSLEEPERNONAC, NONSLEEPERAC} :-");
		String busType = sc.next();
		BusType b=BusType.valueOf(busType.toUpperCase());
		sc.nextLine();  //int id, String busreg,BusType bt, int seets
		BusDeatails busD= new BusDeatails(bid, rid, b, seats); 
		System.out.println("================================================");
		return busD;
	}
	
	
	public static void main(String[] args) {
		BusRoute[] busRout=new BusRoute[10];
		BusDeatails[] busDeatails=new BusDeatails[10];
		
		System.out.println("How many pass are ther");
		int n= sc.nextInt();
		sc.nextLine();
		for (int i=0; i<n; i++) {
			System.out.println("Enter bus Deatail ");
			busDeatails[i]=getBus();
			
			System.out.println("Enter route deatails ");
			busRout[i]=getroute();
		}
		System.out.println();
		System.out.println("Enter 1 if you want to see Entered Deatails  :");
		int l=sc.nextInt();
		sc.nextLine();
		do{
			if(l==1) {
		
				for(int i=0; i<n; i++) {
					System.out.println(busRout[i]);
					System.out.println("===========and=========");
					System.out.println(busDeatails[i]);
		
				}
			}else {
				System.out.println("i said yout to enter 1");
			}
		}while(l==1);
	}

}
