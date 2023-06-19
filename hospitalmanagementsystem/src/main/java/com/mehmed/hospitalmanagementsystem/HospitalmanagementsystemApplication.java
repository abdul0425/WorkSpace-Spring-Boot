package com.mehmed.hospitalmanagementsystem;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HospitalmanagementsystemApplication {

	@Bean
	public ModelMapper getModelMapperObject() {
		return new ModelMapper();
	}
	
	@Bean
	public RestTemplate getRestTemplateObject() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HospitalmanagementsystemApplication.class, args);
	}

}
