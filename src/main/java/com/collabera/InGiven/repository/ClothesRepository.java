package com.collabera.InGiven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.InGiven.model.Clothes;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes,Long> {
	
}
