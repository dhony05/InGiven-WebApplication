package com.collabera.InGiven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.InGiven.model.Toy;

@Repository
public interface ToyRepository extends JpaRepository<Toy, Long>{}
