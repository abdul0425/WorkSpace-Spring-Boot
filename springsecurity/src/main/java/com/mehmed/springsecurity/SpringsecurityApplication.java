package com.mehmed.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
public class SpringsecurityApplication {

	/*
	 * @Bean public UserDetailsService getUserDetailsService() { return new
	 * InMemoryUserDetailsManager(); }
	 */
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityApplication.class, args);
	}

}
