package com.boot.mongo.embedded.model;

public class Address {

	private String addressData;
	private String city;
	private String state;
	private int pincode;
	public String getAddressData() {
		return addressData;
	}
	public void setAddressData(String addressData) {
		this.addressData = addressData;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressData=" + addressData + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ "]";
	}
	
}
