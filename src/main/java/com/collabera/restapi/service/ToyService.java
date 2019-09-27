package com.collabera.restapi.service;

import java.util.Optional;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.restapi.Repository.ToyRepository;
import com.collabera.restapi.model.Toy;
import com.collabera.restapi.model.ToyDTO;
import com.collabera.restapi.model.ToyMapper;

@Service
public class ToyService {
	private final ToyRepository repository;
	private final ToyMapper mapper;
	
	@Autowired
	public ToyService(ToyRepository repository, ToyMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	public List<ToyDTO> findAll() {
		return repository.findAll().stream().map(toy -> mapper.toDTO(toy)).collect(Collectors.toList());
	}

	public ToyDTO find(long id) {
		Optional<Toy> toy = repository.findById(id);
		return (toy.isPresent()) ? mapper.toDTO(toy.get()) : null;
	}

	public ToyDTO save(ToyDTO new_toy) {
		return mapper.toDTO(repository.save(mapper.toModel(new_toy)));
	}

	public ToyDTO update(ToyDTO toy_change) {
		Optional<Toy> toy = repository.findById(toy_change.getId());
		if (toy.isPresent()) {
			Toy toy_data = toy.get();
			// id is join column here; no if needed for it
			if (toy_change.getName() == null) {
				toy_change.setName(toy_data.getName());
			}
			if (toy_change.getDescription() == null) {
				toy_change.setDescription(toy_data.getDescription());
			}
			return save(toy_change);
		}
		throw new IllegalArgumentException();
	}

	public void delete(long id) {
		repository.deleteById(id);
	}
}
