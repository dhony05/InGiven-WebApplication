package com.collabera.restapi.restcontroller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.InGiven.model.ToyDTO;
import com.collabera.InGiven.service.ToyService;

@RestController
@RequestMapping("/api")
public class ToyController { // Add error handling
	private final ToyService service;
	
	@Autowired
	public ToyController(ToyService service) {
		this.service = service;
	}
	
	@GetMapping("/toys")
	public ResponseEntity<List<ToyDTO>> findAll() {
		System.out.println("ME");
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/toys/{id}")
	public ResponseEntity<ToyDTO> find(@PathVariable String id) {
		return ResponseEntity.ok(service.find(Long.valueOf(id)));
	}
	
	@PostMapping("/toys")
	public ResponseEntity<ToyDTO> create(@RequestBody @Valid ToyDTO new_toy) throws URISyntaxException {
		ToyDTO result = service.save(new_toy);
		return ResponseEntity.created(new URI("/api/toys/" + result.getId())).body(result);
	}
	
	@PutMapping("/toys")
	public ResponseEntity<ToyDTO> update(@RequestBody @Valid ToyDTO updated_toy) {
		ToyDTO result = service.update(updated_toy);
		return ResponseEntity.ok().body(result);
	}
	
	@DeleteMapping("/toys/delete/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		service.delete(Long.valueOf(id));
		return ResponseEntity.ok().build();
	}
}
