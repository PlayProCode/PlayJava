package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	
	@OneToOne
	@JoinColumn
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address add) {
		this.address = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
