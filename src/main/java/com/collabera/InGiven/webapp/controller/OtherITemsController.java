package com.collabera.InGiven.webapp.controller;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.collabera.InGiven.webapp.controller.data.OtherItem;

@Controller
//@RequestMapping(/other)
public class OtherItemsController {
	private final RestTemplate restTemplate = new RestTemplate();
	private final String URLNameSpace = "http://localhost:8080/api/other";
	
	
	@GetMapping("/other")
	public String displayAllAndForms(Model model) {
		System.out.println(restTemplate.getForObject(URLNameSpace, OtherItem[].class));
		System.out.println("Here !!!!!");
		List<OtherItem> otherList = Arrays.stream(restTemplate.getForObject(URLNameSpace, OtherItem[].class))
				.collect(Collectors.toList());
		
		System.out.println("List:" + otherList);
		model.addAttribute("otherItemBag", otherList);
		model.addAttribute("other", new OtherItem());
		return "otherItem";
	}
	
	@PostMapping("/other")
	public String AddToForm(@ModelAttribute OtherItem otherItem, Model model) {
		ResponseEntity<OtherItem> response = restTemplate.postForEntity(URLNameSpace , otherItem, OtherItem.class);
		model.addAttribute("otherItem" ,response);
		return "redirect:/other"; 
//		restTemplate.delete(url);
	}
	
	@DeleteMapping("/other")
	public String DeleteFromForm() {
		restTemplate.delete(URLNameSpace);
		
		return "redirect:/other";
		
	}
}

	

