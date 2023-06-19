package com.mehmed.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.basic.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
