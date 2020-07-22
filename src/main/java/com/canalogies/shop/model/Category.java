package com.canalogies.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 

@Entity
@Table 
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String categoryId;
	String categoryName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Category(int id, String categoryId, String categoryName) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	public Category() {
		 
	}
	
}
