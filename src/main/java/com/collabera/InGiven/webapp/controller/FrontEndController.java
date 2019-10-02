package com.collabera.InGiven.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontEndController {
	@RequestMapping("/")
	public String displayIndex() {
		return "index";
	}
	
	@RequestMapping("/toys")
	public String goToToys() {
		return "toys";
	}
	
	@RequestMapping("/clothes")
	public String goToClothes() {
		return "clothes";
	}
	
	@RequestMapping("/other")
	public String goToOther() {
		return "otherItem";
	}
}
