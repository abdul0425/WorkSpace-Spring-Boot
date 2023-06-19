package com.mehmed.esop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.esop.model.AllocationModel;

public interface AllocationRepository extends JpaRepository<AllocationModel, Long>{

}
