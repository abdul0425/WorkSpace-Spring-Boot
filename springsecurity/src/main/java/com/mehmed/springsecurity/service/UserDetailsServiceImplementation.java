package com.mehmed.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mehmed.springsecurity.configuration.UserPrinciple;
import com.mehmed.springsecurity.model.UserModel;
import com.mehmed.springsecurity.repository.UserRepository;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserModel userModel = userRepository.findByUsername(username);
		if (userModel == null) {
			throw new UsernameNotFoundException(" Username Not Found !");
		}
		return new UserPrinciple(userModel);

	}

}
