package com.mehmed.cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.cafe.constant.CafeConstants;
import com.mehmed.cafe.model.UserModel;
import com.mehmed.cafe.service.UserService;
import com.mehmed.cafe.utils.CafeUtils;

@RestController
@RequestMapping(value = "/api")
public class UserController {

	@Autowired
	public UserService service;
	
	@PostMapping(value = "/signup")
	public ResponseEntity<String> signUp(@RequestBody UserModel userModel) {
		try {
			return service.signUp(userModel);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
