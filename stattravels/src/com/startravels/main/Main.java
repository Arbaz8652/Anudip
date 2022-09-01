package com.startravels.main;

import java.util.Scanner;

import com.startravel.busmodel.BusDeatails;
import com.startravel.busmodel.BusType;
import com.startravels.bookingdeatails.PassangerDeatails;
import com.startravels.route.BusRoute;

public class Main {
	public static PassangerDeatails[] passangerarray=new PassangerDeatails[10];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BusDeatails b1=new BusDeatails(14209, "MH01AC9089", BusType.SLEEPERAC, 12);
		BusDeatails b2=new BusDeatails(14210, "MH01AC9090", BusType.SLEEPERNONAC, 12);
		BusRoute br1=new BusRoute(12232, "Bangluru", "Mumbai");
		BusRoute br2=new BusRoute(12223, "Mumbai", "Bangluru");
		BusDeatails[] buss=new BusDeatails[2];
		buss[0]=b1;
		buss[1]=b2;
		BusRoute[] bussroute=new BusRoute[2];
		bussroute[0]=br1;
		bussroute[1]=br2;
		System.out.println("===WELCOME TO STAR TRAVELLS===");
		Main.start(sc,b1);
		System.out.println("Ticket Information");
		
		System.out.println(buss[0].getBusId()+buss[0].getBusRegistrationnumber()+buss[0].getBusType()+buss[0].getNoOfSeats());
		System.out.println(passangerarray[0].getName()+passangerarray[0].getAge()+passangerarray[0].getEmail()+passangerarray[0].getMobileNo());
		
		
	}

	public static void start(Scanner sc,BusDeatails b1 ) {
		
		System.out.println();
		System.out.println("1)  :  Bangluru to Mumbai");
		System.out.println("2)  :  Mumbai to Bangluru");
		int n=sc.nextInt();
		System.out.println("===============================");
		System.out.println("Start Booking Ticket");
//		System.out.println("Enter No. of tickects");
	
		
		
			
			System.out.println("Enter name :- ");
			String name=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter email :- ");
			String email=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter your Age  :-");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Contact no :- ");
			String nom=sc.nextLine();
			sc.nextLine();
			System.out.println("available seats are: "+b1.getNoOfSeats());
			System.out.println("Enter No. of Seats");
			int y= sc.nextInt();
			sc.nextLine();
			if(y>b1.getNoOfSeats()) {
				System.out.println("Not Available");
				
			}else {
				b1.setNoOfSeats(b1.getNoOfSeats()-y);
				//String name,String email,int age,int quantity,String mobileNo
			}
			passangerarray[0]=new PassangerDeatails(name, email, age, y, nom);
		
			
	}
	
	
}	
		
		
//		
//	public static MB(Scanner sc, )
//	
//	
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
//	static Scanner sc=new Scanner(System.in);
//	
//	public static BusRoute getroute() {
////		System.out.println("Enter BusID :-");
////		int bid=sc.nextInt();
////		sc.nextLine();
//		System.out.println("================================================");
//
//		System.out.println("Enter Route Id :-");
//		int rid=sc.nextInt();	
//		sc.nextLine();
//		System.out.println("Enter Starting point :-");
//		String start=sc.next();
//		sc.nextLine();
//		System.out.println("Enter Destination :-");
//		String destination = sc.next();
//		sc.nextLine();
//		BusRoute br= new BusRoute(rid,start,destination); 
//		System.out.println("================================================");
//
//		 return br;
//	}
//	
//	public static BusDeatails getBus() {
//		System.out.println("================================================");
//
//		System.out.println("Enter BusID :-");
//		int bid=sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Bus no :-");
//		String rid=sc.next();	
//		sc.nextLine();
//		System.out.println("Enter number of seats :-");
//		int seats=sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Type {SLEEPERAC, SLEEPERNONAC, NONSLEEPERNONAC, NONSLEEPERAC} :-");
//		String busType = sc.next();
//		BusType b=BusType.valueOf(busType.toUpperCase());
//		sc.nextLine();  //int id, String busreg,BusType bt, int seets
//		BusDeatails busD= new BusDeatails(bid, rid, b, seats); 
//		System.out.println("================================================");
//		return busD;
//	}
	
	
	
//		BusRoute[] busRout=new BusRoute[10];
//		BusDeatails[] busDeatails=new BusDeatails[10];
//		
//		System.out.println("How many pass are ther");
//		int n= sc.nextInt();
//		sc.nextLine();
//		for (int i=0; i<n; i++) {
//			System.out.println("Enter bus Deatail ");
//			busDeatails[i]=getBus();
//			
//			System.out.println("Enter route deatails ");
//			busRout[i]=getroute();
//		}
//		System.out.println();
//		System.out.println("Enter 1 if you want to see Entered Deatails  :");
//		int l=sc.nextInt();
//		sc.nextLine();
//		do{
//			if(l==1) {
//		
//				for(int i=0; i<n; i++) {
////					System.out.println(busRout[i]);
//					System.out.println("===========and=========");
//					System.out.println(busDeatails[i]);
//		
//				}
//			}else {
//				System.out.println("i said yout to enter 1");
//			}
//		}while(l==1);
//	}


