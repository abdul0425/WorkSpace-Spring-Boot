package com.mehmed.hospitalmanagementsystem.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.hospitalmanagementsystem.dto.PatientDto;
import com.mehmed.hospitalmanagementsystem.model.PatientModel;
import com.mehmed.hospitalmanagementsystem.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public void savePatientDetails(PatientDto patientDto) {
		PatientModel patientModel = modelMapper.map(patientDto, PatientModel.class);
		patientRepository.save(patientModel);
	}

	public PatientModel getByPatientId(Long patientId) {
		return patientRepository.findById(patientId).get();
	}

	public List<PatientModel> getAllPatientDetails() {
		return patientRepository.findAll();
	}

}
