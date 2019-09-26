package com.collabera.InGiven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FrontEndController {
	@RequestMapping("/toys")
	public String goToToys() {
		return "toys";
	}
}
