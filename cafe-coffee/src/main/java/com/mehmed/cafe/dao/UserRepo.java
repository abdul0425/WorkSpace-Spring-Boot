package com.mehmed.cafe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mehmed.cafe.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer>{

	@Query("select u from UserModel u where u.email=:email")
	UserModel findByEmail(@Param("email") String email);
}
