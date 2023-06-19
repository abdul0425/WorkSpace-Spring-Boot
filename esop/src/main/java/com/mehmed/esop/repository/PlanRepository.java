package com.mehmed.esop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.esop.model.PlanModel;

public interface PlanRepository extends JpaRepository<PlanModel, Long>{

	PlanModel findByIsCurrentPlan(boolean b);

}
