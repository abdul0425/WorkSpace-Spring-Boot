package com.mehmed.hospitalmanagementsystem.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.hospitalmanagementsystem.dto.TestDetailsDto;
import com.mehmed.hospitalmanagementsystem.model.TestDetailsModel;
import com.mehmed.hospitalmanagementsystem.repository.TestDetailsRepository;

@Service
public class TestDetailsService {

	@Autowired
	private TestDetailsRepository testDetailsRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public void saveTestDetails(TestDetailsDto testDetailsDto) {
		TestDetailsModel testDetailsModel = modelMapper.map(testDetailsDto, TestDetailsModel.class);
		testDetailsRepository.save(testDetailsModel);
		
		
		
	}

}
