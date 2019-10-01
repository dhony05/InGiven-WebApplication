package com.collabera.InGiven.restAPI.model.entity;

import java.time.LocalDate;

import javax.persistence.*;
@Entity
@Table(name = "Other_items")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	//Model for other objects 
	//Creating colums names 
	@Column(name = "item_id")
	private Long item_id ;
	@Column(name = "name")
	private String name;
	@Column(name = "category")
	private String category;
	@Column(name = "quantity")
	private int quantity;
	
	
	
	@Column(name = "zipCode")
	private int zipCode;
	
	
	
	@Column(name = "date_posted")
	private LocalDate datePosted;
	
	

	public long getId() {
		return item_id;
	}

	public void setId(Long id) {
		this.item_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public LocalDate getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(LocalDate datePosted) {
		this.datePosted = datePosted;
	}
	
	
}


