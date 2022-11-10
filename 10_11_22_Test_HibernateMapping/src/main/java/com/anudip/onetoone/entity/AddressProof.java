package com.anudip.onetoone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AddressProof {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(length = 25,nullable = false)
	private String type;
	
	@Column(length = 25,nullable = false)
	private String address;
	
	@Column(length = 25,nullable = false)
	private String city;
	
	@Column(length = 25,nullable = false)
	private String state;
	
	
}
