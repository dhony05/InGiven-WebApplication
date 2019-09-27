package com.collabera.restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.restapi.model.Clothes;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes,Long> {
	
}
