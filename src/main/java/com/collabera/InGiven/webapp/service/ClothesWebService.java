package com.collabera.InGiven.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.collabera.InGiven.webapp.controller.data.ClothesClient;

@Service
public class ClothesWebService {
	
	private RestTemplate restTemplate;
	
	private String clothesRestUrl;
	
	@Autowired
	public ClothesWebService(RestTemplate theRestTemplate, 
										@Value("${clothes.rest.url}") String theUrl) {
		restTemplate = theRestTemplate;
		clothesRestUrl = theUrl;
				
	}
	public List<ClothesClient> getClothes() {
		

		// make REST call
		ResponseEntity<List<ClothesClient>> responseEntity = 
											restTemplate.exchange(clothesRestUrl, HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<ClothesClient>>() {});
		// get the list of clothes from response
		List<ClothesClient> clothes = responseEntity.getBody();

		
		return clothes;
	}
	
	public ClothesClient getClothes(int theId) {


		// make REST call
		ClothesClient theClothes = 
				restTemplate.getForObject(clothesRestUrl + "/" + theId, 
						ClothesClient.class);

		
		return theClothes;
	}


	public void saveClothes(ClothesClient theClothes) {

		
		long clothesId = theClothes.getId();

		// make REST call
		if (clothesId == 0) {
			// add Clothes
			restTemplate.postForEntity(clothesRestUrl, theClothes, String.class);			
		
		} else {
			// update Clothes
			restTemplate.put(clothesRestUrl, theClothes);
		}

	}
	
	public void deleteClotjes(int theId) {


		// make REST call
		restTemplate.delete(clothesRestUrl + "/" + theId);

	}



}
