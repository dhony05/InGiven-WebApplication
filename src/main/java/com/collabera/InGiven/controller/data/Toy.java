package com.collabera.InGiven.controller.data;

public class Toy {
	public long id;
	public String name, description;
	public Toy() {}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Toy [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
}

