package com.collabera.InGiven.restAPI.model.dto;

public class ClothesDTO {
	
	private long id;
	
	private String size;
	
	private String style, color, image;

	public ClothesDTO() {
		super();
	}

	public ClothesDTO(int id, String size, String style, String color, String image) {
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
}
