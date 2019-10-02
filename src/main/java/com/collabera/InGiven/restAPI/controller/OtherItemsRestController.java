package com.collabera.InGiven.restAPI.controller;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.InGiven.restAPI.model.dto.ItemDTO;
import com.collabera.InGiven.restAPI.model.service.OtherItemsService;

@RestController
@RequestMapping("/api")
public class OtherItemsRestController {
	
	public final OtherItemsService otherItemsService;

	public OtherItemsRestController(OtherItemsService otherItemsService) {
		this.otherItemsService = otherItemsService;
	}
	
	@GetMapping("/other")
	public List<ItemDTO> getAll() {
		return otherItemsService.getAllItems();
	}

	@GetMapping("/other/{id}")
	public ResponseEntity<ItemDTO> get(@PathVariable Long id) {
		ItemDTO item = otherItemsService.getItemInId(id);
		return ResponseEntity.ok(item);
	}
	
	@PostMapping("/other")
	public ResponseEntity<ItemDTO> create(@RequestBody @Valid ItemDTO item) throws URISyntaxException {
		ItemDTO result = otherItemsService.addingItem(item);
		return ResponseEntity.created(new URI("/api/other/" + result.getItem_id())).body(result);
	}
	
	@PutMapping("/other")
	public ResponseEntity<ItemDTO> updateJob(@RequestBody @Valid ItemDTO item) {
		ItemDTO result = otherItemsService.update(item);
		return ResponseEntity.ok().body(result);
	}
	
	@DeleteMapping("/other/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		otherItemsService.delete(id);
		return ResponseEntity.ok().build();
	}





}
