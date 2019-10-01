package com.collabera.InGiven.restAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.InGiven.restAPI.model.entity.Clothes;
import com.collabera.InGiven.restAPI.model.service.ClothesService;

@RestController
@RequestMapping("/clothing")
public class ClothesRestController {
	
	private ClothesService clothesService;
	
	@Autowired
	public ClothesRestController(ClothesService theClothesService) {
		clothesService = theClothesService;
	}
	@GetMapping("/clothing")
	public List<Clothes> getClothes(){
		
			return clothesService.findAll();
	}
	
	@GetMapping("/clothing/{clothesId}")
	public Clothes getclothes(@PathVariable int clothesId){
		
		Clothes theClothes = clothesService.findById(clothesId);
			
//			if(theClothes == null) {
//				throw new clothesNotFoundException("Clothes Not Found - " + clothesId);
//			}
			
			return theClothes;
	}
	
	@PostMapping("/clothing")
	public Clothes addClothes(@RequestBody Clothes theClothes) {
				
		theClothes.setId(0);

		clothesService.save(theClothes);
		
		return theClothes;
	}
	
	
	@PutMapping("/clothing")
	public Clothes updateClothes(@RequestBody Clothes theClothes) {
		
		clothesService.save(theClothes);
		
		return theClothes;
	}
		
	@DeleteMapping("/clothing/{clothesId}")
	public String deleteClothes(@PathVariable int clothesId) {
		
		Clothes tempClothes = clothesService.findById(clothesId);
		 		
		if (tempClothes == null) {
			throw new RuntimeException("Clothes id not found - " + clothesId);
		}
		
		clothesService.deleteById(clothesId);
		
		return "Deleted Clothes id - " + clothesId;
	}
	
}
