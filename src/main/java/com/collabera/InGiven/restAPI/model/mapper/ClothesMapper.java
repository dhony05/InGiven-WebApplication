package com.collabera.InGiven.restAPI.model.mapper;

import org.springframework.stereotype.Component;

import com.collabera.InGiven.restAPI.model.dto.ClothesDTO;
import com.collabera.InGiven.restAPI.model.entity.Clothes;

@Component
public class ClothesMapper { // should be static methods in their respective classes

		public Clothes toModel(ClothesDTO in) {
			
			Clothes out = new Clothes();
			out.setId(in.getId());
			out.setStyle(in.getStyle());
			out.setSize(in.getSize());
			out.setColor(in.getColor());
			out.setImage(in.getImage());
			return out;
		}
		public ClothesDTO toDTO(Clothes in) {
			
			ClothesDTO out = new ClothesDTO();
			out.setId(in.getId());
			out.setStyle(in.getStyle());
			out.setSize(in.getSize());
			out.setColor(in.getColor());
			out.setImage(in.getImage());
			return out;
		}
}
