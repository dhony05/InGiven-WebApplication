package com.collabera.InGiven.model;

import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
	
	public 	Item toEntity(ItemDTO item_dto) {
		Item otherItem = new Item();  // creating an Instance otherItem from Item class
		otherItem.setName(item_dto.getName()); // getting the info from dto
		otherItem.setCategory(item_dto.getCategory());
		otherItem.setQuantity(item_dto.getQuantity());
		otherItem.setZipCode(item_dto.getZipCode());
		otherItem.setDatePosted(item_dto.getDatePosted());
		return otherItem;
		
	}
	
	public ItemDTO toDto(Item item_entity) {
		ItemDTO otherItem = new ItemDTO();
		otherItem.setItem_id(item_entity.getId());
		otherItem.setName(item_entity.getName());
		otherItem.setCategory(item_entity.getCategory());
		otherItem.setQuantity(item_entity.getQuantity());
		otherItem.setZipCode(item_entity.getZipCode());
		otherItem.setDatePosted(item_entity.getDatePosted());
		
		return otherItem;
		
	}

}
