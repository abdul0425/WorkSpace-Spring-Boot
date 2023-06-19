package com.mehmed.hospitalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.hospitalmanagementsystem.model.PatientModel;

public interface PatientRepository extends JpaRepository<PatientModel, Long>{

	PatientModel findByPatientId(Long patientId);

}
