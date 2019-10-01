package com.collabera.InGiven.restAPI.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.InGiven.restAPI.model.entity.Clothes;
import com.collabera.InGiven.restAPI.model.repository.ClothesRepository;

@Service
public class ClothesService {
	
	private ClothesRepository clothesRepository;
	
	@Autowired
	public ClothesService(ClothesRepository theClothesRepository) {
	
		clothesRepository = theClothesRepository;
	}
	
	public List<Clothes> findAll() {
	
		return clothesRepository.findAll();
	
	}
	
	public Clothes findById(long theId) {
		
		Optional<Clothes> result = clothesRepository.findById(theId);
		
		Clothes theclothes = null;
		
		if(result.isPresent()) {
			theclothes = result.get();
		}
		
		else {
			throw new RuntimeException("We didn't find clothes Id - " + theId);
		}
		
		return theclothes;

	}
	
	public void save(Clothes theclothes) {
		
		clothesRepository.save(theclothes);

	} 

	public void deleteById(long theId) {
		
		clothesRepository.deleteById(theId);;

	}
	
}
