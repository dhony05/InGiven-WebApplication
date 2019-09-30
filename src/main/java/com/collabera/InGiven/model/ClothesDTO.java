package com.collabera.InGiven.model;

public class ClothesDTO {
	
	private int id, size;
	
	private String style, color;

	public ClothesDTO() {
		super();
	}

	public ClothesDTO(int id, int size, String style, String color) {
		super();
		this.id = id;
		this.size = size;
		this.style = style;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
