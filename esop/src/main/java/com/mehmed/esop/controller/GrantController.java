package com.mehmed.esop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.esop.constant.ApplicationConstant;
import com.mehmed.esop.dto.GrantDto;
import com.mehmed.esop.service.GrantService;

@RestController
@RequestMapping(value = ApplicationConstant.API_GRANTS)
public class GrantController {

	@Autowired
	private GrantService grantService;
	
	
	
	@PostMapping(value = ApplicationConstant.SAVE_GRANT_DETAILS)
	public void saveGrantDetails(@RequestBody List<GrantDto> grantDtoList)
	{
		grantService.processGrantDetails(grantDtoList);
	}
	
	@PostMapping(value = ApplicationConstant.APPROVE_ALL_GRANT_STATUS)
	public void approveAllGrantStatus(@RequestBody List<Long> grantIdList)
	{
		grantService.approveAllGrantStatus(grantIdList);
	}
}
