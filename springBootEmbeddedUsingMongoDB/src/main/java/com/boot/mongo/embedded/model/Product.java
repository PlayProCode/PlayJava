package com.boot.mongo.embedded.model;

public class Product {
	private String productName;
	private int price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + "]";
	}
	
}
