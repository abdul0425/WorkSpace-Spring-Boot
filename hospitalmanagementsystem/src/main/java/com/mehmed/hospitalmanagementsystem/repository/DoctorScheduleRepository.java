package com.mehmed.hospitalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.hospitalmanagementsystem.model.DoctorSchedule;

public interface DoctorScheduleRepository extends JpaRepository<DoctorSchedule, Long>{

	DoctorSchedule findByDoctorId(Long doctorId);

}
