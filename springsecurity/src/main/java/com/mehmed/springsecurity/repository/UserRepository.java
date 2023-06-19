package com.mehmed.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.springsecurity.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{

	UserModel findByUsername(String username);

}
