package com.collabera.InGiven.restAPI.model.mapper;

import org.springframework.stereotype.Component;

import com.collabera.InGiven.restAPI.model.dto.BookDTO;
import com.collabera.InGiven.restAPI.model.entity.Book;

@Component
public class BookMapper {

	public Book toEntity(BookDTO dto) {
		Book book = new Book();
		book.setId(dto.getId());
		book.setTitle(dto.getTitle());
		book.setAuthor(dto.getAuthor());
		book.setGenre(dto.getGenre());
		book.setPublicationYear(dto.getPublicationYear());
		
		return book;
	}

	public BookDTO toDto(Book entity) {
		BookDTO dto = new BookDTO();
		dto.setId(entity.getId());
		dto.setTitle(entity.getTitle());
		dto.setAuthor(entity.getAuthor());
		dto.setGenre(entity.getGenre());
		dto.setPublicationYear(entity.getPublicationYear());
        
		return dto;
	}

}
