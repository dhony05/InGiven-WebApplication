package com.collabera.InGiven.restAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClothesConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
