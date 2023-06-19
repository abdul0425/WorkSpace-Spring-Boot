package com.mehmed.hospitalmanagementsystem.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mehmed.hospitalmanagementsystem.configuration.ApplicationConstant;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name=ApplicationConstant.APPOINTMENT_DETAILS)
@Data
@ToString
public class AppointmentModel implements Serializable{

	@Id
	@Column(name="appointment_id")
	private Long appointmentId;
	@Column(name="patient_id")
	private Long patientId;
	@Column(name="doctor_id")
	private Long doctorId;
	@Column(name="date")
	private Date date;
	@Column(name="time")
	private String time;
	@Column(name="booking_confirmation")
	private boolean isBookingConfirmed;
	@Column(name="prescription")
	private String prescription;
	
	
	
}
