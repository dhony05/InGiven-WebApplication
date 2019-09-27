package com.collabera.restapi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collabera.restapi.Repository.ItemRepository;
import com.collabera.restapi.model.Item;
import com.collabera.restapi.model.ItemDTO;
import com.collabera.restapi.model.ItemMapper;

@Service
@Transactional
public class OtherItemsService {
	
	
	private final ItemRepository otherItemRepository;
	private final ItemMapper otherItemMapper;
	
	public OtherItemsService(ItemRepository otherItemRepository, ItemMapper otherItemMapper) {
		this.otherItemRepository = otherItemRepository;
		this.otherItemMapper = otherItemMapper;
	}
	
	public List<ItemDTO> getAllItems() {
		return otherItemRepository.findAll().stream().map(other -> otherItemMapper.toDto(other)).collect(Collectors.toList());
	
	}
	
	/***
	 * This method will handle the search for one item , will take the Id
	 * @param id
	 * @return
	 */
	public ItemDTO getItemInId(Long id) {
		Optional<Item> otherItemTarget = otherItemRepository.findById(id);
		if (otherItemTarget.isPresent()) {
			return otherItemMapper.toDto(otherItemTarget.get());
		}
		return null;
	}
	
	/***
	 * Adding a new Item, setting the reference to instance 
	 * @param newItem
	 * @return
	 */
	public ItemDTO addingItem(ItemDTO newItem) {
		Item otherItem_Entity = otherItemMapper.toEntity(newItem);
		Item added = otherItemRepository.save(otherItem_Entity);
		return otherItemMapper.toDto(added);
	}
	
	public ItemDTO update(ItemDTO itemToUpdate) {
		Long otherItemId= itemToUpdate.getItem_id();
		Optional<Item> findById = otherItemRepository.findById(otherItemId);
		if (findById.isPresent()) {
			Item other = findById.get();
			other.setCategory(itemToUpdate.getCategory());
			other.setQuantity(itemToUpdate.getQuantity());
			other.setZipCode(itemToUpdate.getZipCode());
			Item added = otherItemRepository.save(other);
			return otherItemMapper.toDto(added);
		} else {
			throw new IllegalArgumentException();
		}
	}




	public void delete(Long id) {
		otherItemRepository.deleteById(id);
		
	}
	
	public void deleteAll() {
		otherItemRepository.deleteAll();
		
		
	}

	

	
	
	

	


}
