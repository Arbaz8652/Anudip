package com.startravels.busmodel;

public class BusDeatails {
	private int busId;
	private String busRegistrationnumber;
	private BusType busType;
	private int noOfSeats;
	
	
	public BusDeatails(int id, String busreg,BusType bt, int seets){
		this.busId=id;
		this.busRegistrationnumber=busreg;
		this.busType=bt;
		this.noOfSeats=seets;
	}
	
	
}
