package com.mehmed.hospitalmanagementsystem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mehmed.hospitalmanagementsystem.configuration.ApplicationConstant;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = ApplicationConstant.PATIENT_DETAILS)
@Data
@ToString
public class PatientModel implements Serializable{

	
	@Id
	@Column(name="patient_id")
	private Long patientId;
	@Column(name="patient_name")
	private String patientName;
	@Column(name="email")
	private String email;
	@Column(name="date_of_birth")
	private String dateOfBirth;
	@Column(name="contact_number")
	private String contactNumber;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="pin_code")
	private Long pinCode;
	@Column(name = "remarks")
	private String remarks;
	
}
