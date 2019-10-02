package com.collabera.InGiven.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.collabera.InGiven.restAPI.model.entity.Clothes;
import com.collabera.InGiven.restAPI.model.service.ClothesService;

@Controller
@RequestMapping("/clothes")
public class ClothesWebController {
			
			// load the Clothes data
			private ClothesService clothesService;

			@Autowired
			public ClothesWebController(ClothesService theClothesService) {
				clothesService = theClothesService;
			}

			// add mapping for "/list"
			@GetMapping("/list")
			public String listclothes(Model theModel) {
				
				//get clothes from the database
				List<Clothes> theClothes = clothesService.findAll();
				
				//add to the Spring Model
				theModel.addAttribute("link", theClothes);
				return "clothes";
			}
			
			@GetMapping("/showFormForAdd")
			public String ShowFormForAdd (Model theModel) {
				
				//create the model attribute
				Clothes theClothes = new Clothes();
				
				theModel.addAttribute("clothes",theClothes);
				return "clothes-form";
			}
			
			@GetMapping("/showFormForUpdate")
			public String ShowFormForUpdate(@RequestParam("clothesId") int theId, Model theModel) {
				
				//get the clothes from the service
				Clothes theClothes = clothesService.findById(theId);

				//set clothes as a model attribute to pre-populate the form
				theModel.addAttribute("clothes",theClothes);
					
				//send over to the form
				return "clothes-form";
			}
			
			@GetMapping("/delete")
			public String delete(@RequestParam("clothesId") int theId) {
				//delete the clothes
				clothesService.deleteById(theId);
				
				// redirect to the list
				return "redirect:/clothes/list";
			}
			
			@PostMapping("/save")
			public String saveClothes (@ModelAttribute ("clothes") Clothes theClothes) {
				
				// save the clothes
				clothesService.save(theClothes);
				
				// use a redirect to prevent duplicate submissions
				return "redirect:/clothes/list";
			}
}
