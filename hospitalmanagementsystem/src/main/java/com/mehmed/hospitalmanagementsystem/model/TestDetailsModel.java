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
@Table(name = ApplicationConstant.TEST_DETAILS)
@Data
@ToString
public class TestDetailsModel implements Serializable{

	@Id
	@Column(name = "test_id")
	private Long testId;
	@Column(name = "patient_id")
	private Long patientId;
	@Column(name = "patient_name")
	private String patientName;
	@Column(name = "appointment_id")
	private Long appointmentId;
	@Column(name = "test_date")
	private Date testDate;
	@Column(name = "doctor_id")
	private Long doctorId;
	@Column(name = "remarks")
	private String remarks;
}
