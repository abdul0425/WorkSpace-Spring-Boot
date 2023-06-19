package com.mehmed.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.security.model.UserModel;
import com.mehmed.security.repo.UserRepo;


@Service
public class UserService {

	@Autowired
	public UserRepo repo;
	
	
	public void saveUser(UserModel model) {
		repo.save(model);
	}


	public List<UserModel> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
