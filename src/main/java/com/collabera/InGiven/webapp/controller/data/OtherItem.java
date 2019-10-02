package com.collabera.InGiven.webapp.controller.data;

import java.time.LocalDate;

public class OtherItem {
	public Long item_id;
	
	public String name, category, zipcode;
	
	public int quantity = 1;
	
	public LocalDate datePosted;

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

	public void setDatePosted(String datePosted) {
		LocalDate  localdate = LocalDate.parse(datePosted);
		this.datePosted = localdate;
		System.out.println(datePosted);
	}
	
	@Override
	public String toString() {
		return "OtherItem [item_id=" + item_id + ", name=" + name + ", category=" + category + ", quantity=" + quantity
				+ ", zipCode=" + zipcode + ", datePosted=" + datePosted + "]";
	}

}
