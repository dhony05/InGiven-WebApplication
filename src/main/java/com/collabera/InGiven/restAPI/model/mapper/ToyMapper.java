package com.collabera.InGiven.restAPI.model.mapper;

import org.springframework.stereotype.Component;

import com.collabera.InGiven.restAPI.model.dto.ToyDTO;
import com.collabera.InGiven.restAPI.model.entity.Toy;

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
