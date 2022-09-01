package com.startravels.route;

public class BusRoute {
	
	private int busRouteId;
	private String busRouteCity;
	private String destination;
	
	public BusRoute( int rid, String start, String dest) {
		
		this.setBusRouteCity(start);
		this.setBusRouteId(rid);
		this.setDestination(dest);
	}

	public int getBusRouteId() {
		return busRouteId;
	}

	public void setBusRouteId(int busRouteId) {
		this.busRouteId = busRouteId;
	}

	public String getBusRouteCity() {
		return busRouteCity;
	}

	public void setBusRouteCity(String busRouteCity) {
		this.busRouteCity = busRouteCity;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
}
