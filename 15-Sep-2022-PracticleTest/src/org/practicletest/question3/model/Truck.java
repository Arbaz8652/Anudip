package org.practicletest.question3.model;

public class Truck extends Vehicle {

	
	private String name="Truck";
	public Truck(int noOfwheels, String typeOfFuel) {
		super(noOfwheels, typeOfFuel);
		
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "AutoRikshaw [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
