package com.mehmed.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.security.model.RoleModel;

public interface RoleRepo extends JpaRepository<RoleModel, Integer>{

}
