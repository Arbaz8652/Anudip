package com.startravels.bookingdeatails;

public class PassangerDeatails {
	private String name;
	private String email;
	private int age;
	private int quantity;
	private String mobileNo;
	
	public PassangerDeatails(String name,String email,int age,int quantity,String mobileNo) {
		this.setAge(age);
		this.setEmail(email);
		this.setMobileNo(mobileNo);
		this.setName(name);
		this.setQuantity(quantity);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}
