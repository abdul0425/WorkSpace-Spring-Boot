package com.mehmed.esop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.esop.constant.ApplicationConstant;
import com.mehmed.esop.service.AllocationService;

@RestController
@RequestMapping(value = ApplicationConstant.API_ALLOCATION)
public class AllocationController {

	@Autowired
	private AllocationService allocationService;
	
	
	
	
	@PostMapping(value = ApplicationConstant.UPDATE_ALLOCATION_STATUS)
	public void approveAllocationStatus(List<Long> allocationIdList) {
		allocationService.approveAllocationStatus(allocationIdList);
	}
}
