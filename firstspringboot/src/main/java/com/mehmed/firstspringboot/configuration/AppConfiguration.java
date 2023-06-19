package com.mehmed.firstspringboot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath : applicationdev.properties")
public class AppConfiguration {

	
	  @Value("${user.username}") private String userName;
	  
	  @Value("${user.password}") private String password;
	 

	
	  @Profile("dev")
	  
	  @Bean public void getDevData() {
	  System.out.println("Username  :  "+userName+" Password  :  "+password); }
	 
	/*
	 * @Autowired private Environment environment;
	 * 
	 * @Profile("int")
	 * 
	 * @Bean public void getIntData() {
	 * System.out.println("Username  :  "+environment.getProperty("user.username")
	 * +" Contact  :  " +environment.getProperty("user.password")); }
	 */
}
