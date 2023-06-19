package com.mehmed.hospitalmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.hospitalmanagementsystem.configuration.ApplicationConstant;
import com.mehmed.hospitalmanagementsystem.dto.TestDetailsDto;
import com.mehmed.hospitalmanagementsystem.service.TestDetailsService;

@RestController
@RequestMapping(value = ApplicationConstant.API_TEST_DETAILS)
public class TestDetailsController {

	@Autowired
	private TestDetailsService testDetailsService;
	
	@PostMapping(value = ApplicationConstant.SAVE_TEST_DETAILS)
	public void saveTestDetails(@RequestBody TestDetailsDto testDetailsDto) {
		testDetailsService.saveTestDetails(testDetailsDto);
	}
}
