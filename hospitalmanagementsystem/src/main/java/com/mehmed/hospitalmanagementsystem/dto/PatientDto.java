package com.mehmed.hospitalmanagementsystem.dto;

import javax.persistence.Column;

import lombok.Data;

@Data
public class PatientDto {

	private Long patientId;
	private String patientName;
	private String email;
	private String dateOfBirth;
	private String contactNumber;
	private String address;
	private String city;
	private String state;
	private String country;
	private Double pinCode;
	private String remarks;
}
