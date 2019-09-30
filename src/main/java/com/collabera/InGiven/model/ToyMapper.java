package com.collabera.InGiven.model;

import org.springframework.stereotype.Component;

@Component
public class ToyMapper { // should be static methods in their respective classes
	public Toy toModel(ToyDTO in) {
		Toy out = new Toy();
		out.setId(in.getId());
		out.setName(in.getName());
		out.setDescription(in.getDescription());
		return out;
	}
	public ToyDTO toDTO(Toy in) {
		ToyDTO out = new ToyDTO();
		out.setId(in.getId());
		out.setName(in.getName());
		out.setDescription(in.getDescription());
		return out;
	}
}
