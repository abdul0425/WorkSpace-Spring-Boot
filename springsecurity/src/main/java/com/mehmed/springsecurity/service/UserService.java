package com.mehmed.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.springsecurity.dto.UserDto;
import com.mehmed.springsecurity.model.UserModel;
import com.mehmed.springsecurity.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
//	@Autowired
//	private 
//	
//	public void saveUsernamePassword(UserDto userDto) {
//		userRepository.save(null)
//	}

	public UserModel findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
