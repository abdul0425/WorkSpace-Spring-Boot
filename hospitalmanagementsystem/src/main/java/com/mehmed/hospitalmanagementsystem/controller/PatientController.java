package com.mehmed.hospitalmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.hospitalmanagementsystem.configuration.ApplicationConstant;
import com.mehmed.hospitalmanagementsystem.dto.PatientDto;
import com.mehmed.hospitalmanagementsystem.model.PatientModel;
import com.mehmed.hospitalmanagementsystem.service.PatientService;

@RestController
@RequestMapping(value = ApplicationConstant.API_PATIENT)
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	
	@PostMapping(value = ApplicationConstant.SAVE_PATIENT_DETAILS)
	public void savePatientDetails(@RequestBody PatientDto patientDto) {
		patientService.savePatientDetails(patientDto);
	}
	
	@GetMapping(value = ApplicationConstant.GET_BY_PATIENT_ID)
	public @ResponseBody PatientModel getByPatientId(@PathVariable Long patientId) {
		return patientService.getByPatientId(patientId);
	}
	
	@GetMapping(value = ApplicationConstant.GET_ALL_PATIENT_DETAILS)
	public List<PatientModel> getAllPatientDetails() {
		return patientService.getAllPatientDetails();
	}
	
	
	
	
}
