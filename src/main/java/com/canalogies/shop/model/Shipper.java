package com.canalogies.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Shipper {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String shipperId;
	private String shipperName;
	private String email;
	private String phone;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public String getShipperName() {
		return shipperName;
	}
	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Shipper(int id, String shipperId, String shipperName, String email, String phone, String address) {
		super();
		this.id = id;
		this.shipperId = shipperId;
		this.shipperName = shipperName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public Shipper() {
		
	}
	
}
