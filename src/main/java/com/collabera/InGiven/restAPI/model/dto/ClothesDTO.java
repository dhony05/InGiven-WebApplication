package com.collabera.InGiven.restAPI.model.dto;

public class ClothesDTO {
	
	private long id;
	
	private int size;
	
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
