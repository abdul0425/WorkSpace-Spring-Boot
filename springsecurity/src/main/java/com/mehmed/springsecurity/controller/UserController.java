package com.mehmed.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.springsecurity.dto.UserDto;
import com.mehmed.springsecurity.service.UserService;

@RestController
@RequestMapping(value = "/api/usernamePassword")
public class UserController {

	@Autowired
	private UserService userService;
	
	
//	@PostMapping(value = "/saveUsernamePassword")
//	public void saveUsernamePassword(UserDto userDto) {
//		userService.saveUsernamePassword(userDto);
//	}
}
