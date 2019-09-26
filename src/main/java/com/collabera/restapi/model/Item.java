package com.collabera.restapi.model;

import java.time.LocalDate;

import javax.persistence.*;
@Entity
public class Item {

	
	//Model for other objects
	
	private int id ;
	private String name;
	private String category;
	private int quantity;
	private int zipCode;
	private LocalDate datePosted;
	
	public Item(int newId, String newName, String newCategory, int newQuantity, int zipCode, LocalDate datePosted) {
		this.id = newId;
		this.name = newName;
		this.category = newCategory;
		this.quantity = newQuantity;
		this.zipCode = zipCode;
		
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


	@Override
	public String toString() {
		return "OtherItems [id=" + id + ", name=" + name + ", category=" + category + ", quantity=" + quantity
				+ ", zipCode=" + zipCode + ", datePosted=" + datePosted + "]";
	}

	public LocalDate getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(LocalDate datePosted) {
		this.datePosted = datePosted;
	}
	
	
}


