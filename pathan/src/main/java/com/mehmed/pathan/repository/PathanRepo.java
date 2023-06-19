package com.mehmed.pathan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mehmed.pathan.model.PathanModel;

@Repository
public interface PathanRepo extends JpaRepository<PathanModel, Long>{

}
