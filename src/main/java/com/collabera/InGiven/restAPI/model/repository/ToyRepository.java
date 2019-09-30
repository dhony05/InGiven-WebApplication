package com.collabera.InGiven.restAPI.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.InGiven.restAPI.model.entity.Toy;

@Repository
public interface ToyRepository extends JpaRepository<Toy, Long>{}
