package com.startravels.bookingdeatails;

public class BookingDeatails {
	private int busId;
	private int routeId;
	private PassangerDeatails passde;
	private double ticketcharges;
	
	
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public PassangerDeatails getPassde() {
		return passde;
	}
	public void setPassde(PassangerDeatails passde) {
		this.passde = passde;
	}
	
	public double getticketprice() {
		return ticketcharges;
	}
	public void setticketprice(double amount) {
		this.ticketcharges = amount;
	}
	
}
