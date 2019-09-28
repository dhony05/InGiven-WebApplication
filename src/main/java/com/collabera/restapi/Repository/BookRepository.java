package com.collabera.restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.collabera.restapi.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
}
