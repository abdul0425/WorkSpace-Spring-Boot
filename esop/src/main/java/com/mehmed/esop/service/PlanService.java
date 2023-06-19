package com.mehmed.esop.service;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.esop.dto.PlanDto;
import com.mehmed.esop.model.GrantModel;
import com.mehmed.esop.model.PlanModel;
import com.mehmed.esop.repository.GrantRepository;
import com.mehmed.esop.repository.PlanRepository;

@Service
public class PlanService {

	@Autowired
	private PlanRepository planRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private GrantRepository grantRepository;

	public void updateGrantModelDetails(List<GrantModel> grantModelList) {

	}

	public void savePlanDetails(PlanDto planDto) {
		/*LocalDate now = LocalDate.now();
		LocalDate planEndDate = now.plusYears(5);*/ 
		
		PlanModel planModel = new PlanModel();
		planModel.setCurrentPlan(planDto.isActivePlan());
		planModel.setPlanEndDate(LocalDate.now().plusYears(5));
		planModel.setPlanStartDate(LocalDate.now());
		planModel.setPlanYear(Year.now()+"");
		planModel.setVestingDate(planDto.getVestingDate());
		planModel.setVestingFactor(planDto.getVestingFactor());
		
		
		planRepository.save(planModel);
	}

	

	

}
