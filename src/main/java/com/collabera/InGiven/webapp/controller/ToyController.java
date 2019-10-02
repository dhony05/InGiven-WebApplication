package com.collabera.InGiven.webapp.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.collabera.InGiven.webapp.controller.data.Toy;


@Controller
public class ToyController {
	private final RestTemplate restTemplate = new RestTemplate(); 
	private final String URLNameSpace = "http://localhost:8080/api/toys";
	
	@GetMapping("/toys")
	public String displayAllAndForms(Model model) {
		List<Toy> toyList = Arrays.stream(restTemplate.getForObject(URLNameSpace, Toy[].class))
				.collect(Collectors.toList());
//		System.out.println("List: " + toyList);
		model.addAttribute("toyBin", toyList);
		if (model.containsAttribute("editToy")) {
			model.addAttribute("toy", model.asMap().get("editToy"));
		} else {
			model.addAttribute("toy", new Toy());
		}
//		System.out.println(model);
		return "toys";
	}
	@PostMapping("/toys")
	public String formSubmit(@ModelAttribute Toy toy, Model model, RedirectAttributes redirect_model) {
//		System.out.println("Subbed: " + toy);
		if (toy.getName().equals("")) {
			redirect_model.addFlashAttribute("name_state", 1);
			return "redirect:/toys";
		}
		ResponseEntity<Toy> response;
		if (toy.getId() == 0) { // post
			response = restTemplate.postForEntity(URLNameSpace, toy, Toy.class);
		} else { // put
			response = restTemplate.exchange(URLNameSpace, HttpMethod.PUT, new HttpEntity<Toy>(toy), Toy.class);
			// should be void?
		}
		return "redirect:/toys"; 
	}
	@RequestMapping("/toys/edit/{id}")
	public String setUpEdit(@PathVariable String id, Model model, RedirectAttributes redirect_model) {
		redirect_model.addFlashAttribute("editToy", restTemplate.getForObject(URLNameSpace + "/" + id, Toy.class));
//		displayAllAndForms(model);
//		model.
		return "redirect:/toys";
	}
	@RequestMapping("toys/delete/{id}")
	public String deleteToy(@PathVariable String id) {
		restTemplate.delete(URLNameSpace + "/delete/" + id);
		return "redirect:/toys";
	}
}