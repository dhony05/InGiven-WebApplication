package com.collabera.restapi.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.restapi.model.BookDTO;
import com.collabera.restapi.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	private BookService bookService;

	public BookController(BookService bookService) {
       this.bookService=bookService;
	}
	
	@GetMapping("/books")
	public List<BookDTO> getAll(){
		return bookService.findALl();
	}
	
	

	
	
	
	
	
	
	
	
}
