package com.collabera.InGiven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.InGiven.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
}
