package com.mehmed.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.security.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer>{

	UserModel findByUsername(String username);

}
