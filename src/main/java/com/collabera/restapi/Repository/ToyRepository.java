package com.collabera.restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.restapi.model.Toy;

@Repository
public interface ToyRepository extends JpaRepository<Toy, Long>{}
