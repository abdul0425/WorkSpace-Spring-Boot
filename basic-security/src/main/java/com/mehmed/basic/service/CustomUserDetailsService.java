package com.mehmed.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mehmed.basic.model.User;
import com.mehmed.basic.repository.UserRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepo.findByUsername(username);
		CustomUserDetails customUserDetails = null;
		if(user!=null) {
			customUserDetails = new CustomUserDetails();
			customUserDetails.setUser(user);
		}
		else {
			throw new UsernameNotFoundException("User does not exist with username  :  "+username);
		}
		
		return customUserDetails;
	}

}
