package com.collabera.InGiven.model;

import org.springframework.stereotype.Component;

@Component
public class ClothesMapper { // should be static methods in their respective classes

		public Clothes toModel(ClothesDTO in) {
			
			Clothes out = new Clothes();
			out.setId(in.getId());
			out.setStyle(in.getStyle());
			out.setSize(in.getSize());
			out.setColor(in.getColor());
			return out;
		}
		public ClothesDTO toDTO(Clothes in) {
			
			ClothesDTO out = new ClothesDTO();
			out.setId(in.getId());
			out.setStyle(in.getStyle());
			out.setSize(in.getSize());
			out.setColor(in.getColor());
			return out;
		}
}
