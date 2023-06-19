package com.mehmed.cafe.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mehmed.cafe.model.UserModel;

public interface UserService {

	ResponseEntity<String> signUp(UserModel userModel);

}
