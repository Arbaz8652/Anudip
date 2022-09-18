package org.practicletest.question3.model;

public class Vehicle {

	private int noOfWheels;
	private String typeOfFuel;
	public Vehicle(int noOfwheels, String typeOfFuel) {
		this.noOfWheels=noOfwheels;
		this.typeOfFuel=typeOfFuel;
	}
	
	public void hasWheels() {
		System.out.println("It has "+noOfWheels+" Wheels.");
	}
	
	public void Fuel() {
		System.out.println("Fuel type is "+typeOfFuel+"." );
	}
	

}
