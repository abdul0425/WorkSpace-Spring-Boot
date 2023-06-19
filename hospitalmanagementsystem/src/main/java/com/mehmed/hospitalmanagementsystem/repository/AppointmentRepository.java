package com.mehmed.hospitalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.hospitalmanagementsystem.model.AppointmentModel;
import com.mehmed.hospitalmanagementsystem.model.DoctorSchedule;
import com.mehmed.hospitalmanagementsystem.model.PatientModel;

public interface AppointmentRepository extends JpaRepository<AppointmentModel, Long>{


}
