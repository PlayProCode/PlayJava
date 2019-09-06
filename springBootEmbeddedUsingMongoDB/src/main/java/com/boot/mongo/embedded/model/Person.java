package com.boot.mongo.embedded.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class Person {
	@Id
	private int id;
	private String name;
	private Address address;
	private List<Product> products;

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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", products=" + products + "]";
	}
}
