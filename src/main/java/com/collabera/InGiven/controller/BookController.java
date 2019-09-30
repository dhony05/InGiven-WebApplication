package com.collabera.InGiven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.InGiven.model.BookDTO;
import com.collabera.InGiven.service.BookService;

@RestController
@RequestMapping("/ingiven")
public class BookController {
 	
   @Autowired
   private BookService bookService;
   
   public BookController(BookService bookService) {
      this.bookService=bookService;
    }
	
	@GetMapping("/test")
	public String test() {
		return "here";
	}
	
	@GetMapping("/books")
	public List<BookDTO> getAll(){
		return bookService.findALl();
	}
	
}
