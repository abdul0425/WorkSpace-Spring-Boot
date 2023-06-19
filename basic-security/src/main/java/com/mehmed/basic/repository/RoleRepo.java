package com.mehmed.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.basic.model.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
