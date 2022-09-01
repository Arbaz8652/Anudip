package com.startravel.busmodel;

public class BusDeatails {
	private int busId;
	private String busRegistrationnumber;
	private BusType busType;
	private int noOfSeats;
	
	
	public BusDeatails(int id, String busreg, BusType bt, int seets){
		this.setBusId(id);
		this.setBusRegistrationnumber(busreg);
		this.setBusType(bt);
		this.setNoOfSeats(seets);
	}


	public int getBusId() {
		return busId;
	}


	public void setBusId(int busId) {
		this.busId = busId;
	}


	public String getBusRegistrationnumber() {
		return busRegistrationnumber;
	}


	public void setBusRegistrationnumber(String busRegistrationnumber) {
		this.busRegistrationnumber = busRegistrationnumber;
	}


	public BusType getBusType() {
		return busType;
	}


	public void setBusType(BusType busType) {
		this.busType = busType;
	}


	public int getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	
}
