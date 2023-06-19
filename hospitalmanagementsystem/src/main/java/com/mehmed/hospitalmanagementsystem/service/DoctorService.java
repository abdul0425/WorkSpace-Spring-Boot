package com.mehmed.hospitalmanagementsystem.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.hospitalmanagementsystem.dto.DoctorDto;
import com.mehmed.hospitalmanagementsystem.model.DoctorModel;
import com.mehmed.hospitalmanagementsystem.repository.DoctorRepository;


@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<DoctorModel> getAllDoctorsDetails() {
		return doctorRepository.findAll();
	}



	public DoctorModel getByDoctorName(String doctorName) {
		return doctorRepository.findByDoctorName(doctorName);
	}



	public void saveDoctorDetails(DoctorDto doctorDto) {
		DoctorModel doctorModel = modelMapper.map(doctorDto, DoctorModel.class);
		doctorRepository.save(doctorModel);
	}

}
