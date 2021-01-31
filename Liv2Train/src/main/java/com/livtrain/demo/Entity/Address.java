package com.livtrain.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int address_id;
	private String colroad;
	private String city;
	private String state;
	private int pincode;
	public Address(){
		
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getColroad() {
		return colroad;
	}
	public void setColroad(String colroad) {
		this.colroad = colroad;
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
		return "Address [address_id=" + address_id + ", colroad=" + colroad + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	public Address(String colroad, String city, String state, int pincode) {
		super();
		this.colroad = colroad;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	
}
