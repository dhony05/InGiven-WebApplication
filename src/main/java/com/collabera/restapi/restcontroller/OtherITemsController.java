package com.collabera.restapi.restcontroller;



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

import com.collabera.restapi.service.OtherItemsService;

@RestController
@RequestMapping("/api")
public class OtherITemsController {
	
	public final OtherItemsService otherItemsService;

	public OtherITemsController(OtherItemsService otherItemsService) {
		this.otherItemsService = otherItemsService;
	}
	
	

}
