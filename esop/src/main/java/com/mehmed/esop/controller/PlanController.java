package com.mehmed.esop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.esop.constant.ApplicationConstant;
import com.mehmed.esop.dto.PlanDto;
import com.mehmed.esop.service.PlanService;

@RestController
@RequestMapping(value = ApplicationConstant.API_PLANS)
public class PlanController {

	@Autowired
	private PlanService planService;
	
	@PostMapping(value = ApplicationConstant.SAVE_PLANS_DETAILS)
	public void savePlansDetails(PlanDto planDto)
	{
		planService.savePlanDetails(planDto);
	}
}
