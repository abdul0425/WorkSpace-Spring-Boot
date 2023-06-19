package com.mehmed.hospitalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.hospitalmanagementsystem.model.DoctorModel;

public interface DoctorRepository extends JpaRepository<DoctorModel, Long>{


	DoctorModel findByDoctorName(String doctorName);

}
