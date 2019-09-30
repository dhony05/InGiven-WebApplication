package com.collabera.InGiven.webapp.controller.data;

public class Cloths {
	private long id;
	private String style;
	private String size;
	private String color;
	
	public Cloths() {
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
	
	@Override
	public String toString() {
		return "Clothes [id=" + id + ", style=" + style + ", color=" + color + ", size= " + size + "]";
	}
}
