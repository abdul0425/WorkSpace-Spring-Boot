package com.mehmed.esop;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class EShopApplication {

	@Bean
	public ModelMapper getModelMapperObject() {
		return new ModelMapper();
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(EShopApplication.class, args);
	}

}
