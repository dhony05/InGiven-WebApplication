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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.collabera.InGiven.webapp.controller.data.OtherItem;
import com.collabera.InGiven.webapp.controller.data.Toy;

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
	

	@RequestMapping("/other/edit/{id}")
	public String setUpEdit(@PathVariable String id, Model model, RedirectAttributes redirect_model) {
		redirect_model.addFlashAttribute("editOther", restTemplate.getForObject(URLNameSpace +"/"+id, OtherItem.class));
//		displayAllAndForms(model);
//		model.
		System.out.println("testing.......");
		return "redirect:/other";
	}
	@RequestMapping("other/delete/{id}")
	public String deleteItem(@PathVariable String id) {
		restTemplate.delete(URLNameSpace + "/delete/" +id);
		return "redirect:/other";
	}
}

	

