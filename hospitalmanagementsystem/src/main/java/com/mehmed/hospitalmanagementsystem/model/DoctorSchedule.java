package com.mehmed.hospitalmanagementsystem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mehmed.hospitalmanagementsystem.configuration.ApplicationConstant;

import lombok.Data;

@Entity
@Table(name = ApplicationConstant.DOCTOR_SCHEDULE)
@Data
public class DoctorSchedule implements Serializable{

	@Id
	@Column(name = "schedule_id")
	private Long scheduleId;
	@Column(name = "doctor_id")
	private Long doctorId;
	@Column(name = "total_appointments_slots")
	private Long totalAppointmentSlots;
	@Column(name = "schedule_timing")
	private String scheduleTiming;
	@Column(name = "available_slots")
	private Long availableSlots;
	
	
}
