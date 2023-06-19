package com.mehmed.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.security.model.UserModel;
import com.mehmed.security.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	public UserService service;
	
	@PostMapping("/save")
	public void saveUser(@RequestBody UserModel model) {
			service.saveUser(model);
		}
	@GetMapping("/getAll")
	public  List<UserModel> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/user")
	public String welcome() {
		return "Welcome from User";
	}
}
