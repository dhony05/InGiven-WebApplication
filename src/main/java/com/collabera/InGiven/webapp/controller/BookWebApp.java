package com.collabera.InGiven.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookWebApp {
	@RequestMapping("/books")
	public String index () {
		return "books";
	}


}
