package com.anudip.vehicle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "Vehicle_Deatails")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 25,nullable = false)
	private String type;
	@Column(length = 25,nullable = false)
	private String brandName;
	@Column(length = 25,nullable = false)
	private String modelName;
	@Column(length = 25,nullable = false)
	private long price;
	@Column(length = 25,nullable = false, unique = true)
	private String vehicleNumber;
	
}
