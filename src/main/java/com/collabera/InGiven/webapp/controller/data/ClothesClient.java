package com.collabera.InGiven.webapp.controller.data;

// @JsonIgnoreProperties (ignoreUnknown = true) ----> use it when you consume other jason files that have extra information
public class ClothesClient {
	
	private long id;
	private String style;
	private String size;
	private String color;
	
	public ClothesClient() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
