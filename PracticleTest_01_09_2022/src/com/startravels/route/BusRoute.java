package com.startravels.route;

public class BusRoute {
	
	private int busRouteId;
	private String busRouteCity;
	private String destination;
	
	public BusRoute( int rid, String start, String dest) {
		
		this.busRouteCity=start;
		this.busRouteId=rid;
		this.destination=dest;
	}
	
}
