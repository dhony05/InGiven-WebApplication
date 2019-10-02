package com.collabera.InGiven.restAPI.model.dto;


import java.time.LocalDate;

import javax.validation.constraints.NotNull;
public class ItemDTO {
	
	private Long item_id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String category,zipcode;
	
	
	private int quantity = 1;
	
	
	@NotNull
	private LocalDate datePosted;

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
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

	public String getZipCode() {
		return zipcode;
	}

	public void setZipCode(String zipCode) {
		this.zipcode = zipCode;
	}

	public LocalDate getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(LocalDate datePosted) {
		this.datePosted = datePosted;
	}
	

}
