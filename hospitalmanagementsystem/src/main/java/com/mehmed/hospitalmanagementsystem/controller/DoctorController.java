package com.mehmed.hospitalmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.hospitalmanagementsystem.configuration.ApplicationConstant;
import com.mehmed.hospitalmanagementsystem.dto.DoctorDto;
import com.mehmed.hospitalmanagementsystem.model.DoctorModel;
import com.mehmed.hospitalmanagementsystem.service.DoctorService;

@RestController
@RequestMapping(value = ApplicationConstant.API_DOCTOR)
public class DoctorController {

	
	
	
	@Autowired
	private DoctorService doctorService;

	@PostMapping(value = ApplicationConstant.SAVE_DOCTOR_DETAILS)
	public void saveDoctorDetails(@RequestBody DoctorDto doctorDto) {
		doctorService.saveDoctorDetails(doctorDto);
	}

	@GetMapping(value = ApplicationConstant.GET_ALL_DOCTOR_DETAILS)
	public @ResponseBody List<DoctorModel> getAllDoctorsDetails() {
		return doctorService.getAllDoctorsDetails();
	}

	
	@GetMapping(value = ApplicationConstant.GET_BY_DOCTOR_NAME)
	public @ResponseBody DoctorModel getByDoctorName(String doctorName) {
		return doctorService.getByDoctorName(doctorName);
	}
}
