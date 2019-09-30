package com.collabera.InGiven.webapp.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.collabera.InGiven.webapp.controller.data.Toy;


@Controller
public class ToyController {
	private final RestTemplate restTemplate = new RestTemplate(); 
	private final String URLNameSpace = "http://localhost:8080/api/toy";
	
	@GetMapping("/toys")
	public String displayAllAndForms(Model model) {
		String api_endpoint = URLNameSpace + "s";
		List<Toy> toyList = Arrays.stream(restTemplate.getForObject(api_endpoint, Toy[].class))
				.collect(Collectors.toList());
		System.out.println("List: " + toyList);
		model.addAttribute("toyBin", toyList);
		model.addAttribute("toy", new Toy());
		model.addAttribute("MESSAGE", "See Me?");
		return "toys";
	}
	@PostMapping
	public String formSubmit(@ModelAttribute Toy toy, Model model) {
		ResponseEntity<Toy> response = restTemplate.postForEntity(URLNameSpace + "s", toy, Toy.class);
		return "redirect:/toys"; 
	}
}