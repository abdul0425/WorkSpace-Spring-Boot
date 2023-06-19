package com.mehmed.esop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.esop.model.GrantModel;

public interface GrantRepository extends JpaRepository<GrantModel, Long>{

	//List<GrantModel> findByPlanId(Long planId);

	List<GrantModel> findByGrantStatusAndAllocationStatusAndPlanId(String string, String string2, Long planId);

}
