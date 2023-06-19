package com.mehmed.vender.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.vender.model.VenderModel;

public interface VenderRepo extends JpaRepository<VenderModel, Long>{

}
