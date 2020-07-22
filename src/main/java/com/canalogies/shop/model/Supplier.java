package com.canalogies.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String supplierId;
	String supplierName;
	String phone;
	String email;
	String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Supplier(int id, String supplierId, String supplierName, String phone, String email, String address) {
		super();
		this.id = id;
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public Supplier() {
		 
	}
	
}
