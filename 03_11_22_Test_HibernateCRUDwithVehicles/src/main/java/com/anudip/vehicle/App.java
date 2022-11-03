package com.anudip.vehicle;

import java.util.Scanner;

import com.anudip.vehicle.vehicleDaoImpl.VehicledaoImplementation;


public class App {

	public static void main(String[] args) {
		VehicledaoImplementation cdao=new VehicledaoImplementation();
    	char a;
    	Scanner sc=new Scanner(System.in);
    	do {
    		System.out.println("===========Vehicle Managemet==========");
    		System.out.println("Enter your choice");
    		System.out.println("1. Read Existing Vehicle \n2. Add New Vehicle\n3. Update price\n4. delet Vehicle Info\n5. Exit\n");
    		int c=sc.nextInt();
    		switch(c){
    		case 1:
    			cdao.getVehicelInfo();
    			break;
    		case 2:
    			cdao.addVehicleInfo();
    			break;
    		case 3:
    			cdao.updateVehicleInfo();
    			break;
    		case 4:
    			cdao.deletVehicleInfo();
    			break;
    		case 5:
    			System.exit(0);
    			break;
    		default:
    			System.out.println("Invalid entry");
    		}
    		System.out.println("Do you want to continue ? Y/N");
    		a=sc.next().charAt(0);
    	}while(a=='Y' || a=='y');
    	System.out.println("Thank You.......");
    	sc.close();
	}
}
