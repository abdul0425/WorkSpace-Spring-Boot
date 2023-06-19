package com.mehmed.springsecurity.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.mehmed.springsecurity.service.UserService;

@Configuration
@ComponentScan("com.mehmed.springsecurity")
@EnableWebSecurity
public class UserValidation extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	
	/*
	 * @Bean
	 * 
	 * @Override protected UserDetailsService userDetailsService() {
	 * Collection<UserDetails> details = new ArrayList<>();
	 * details.add(User.withDefaultPasswordEncoder().username("mehmed")
	 * .password("1234").roles("user").build()); return new
	 * InMemoryUserDetailsManager(details); }
	 */

	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		/* provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); */
		
		/* To Encode the Password */
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;

	}

}
