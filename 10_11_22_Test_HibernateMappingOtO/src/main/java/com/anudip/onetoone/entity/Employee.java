package com.anudip.onetoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 25,nullable = false)
	private String name;
	
	@Column(length = 25,nullable = false)
	private String email;
	
	@Column(length = 10,nullable = false)
	private String phone;
	
	@OneToOne(targetEntity = AddressProof.class, cascade = CascadeType.ALL)
	private AddressProof ap;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", ap=" + ap + "]";
	}
	
	
	
}
