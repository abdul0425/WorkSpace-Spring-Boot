package com.mehmed.hospitalmanagementsystem.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DoctorDto {

	private Long doctorId;
	private String doctorName;
	private String contactNumber;
	private String address;
	private String city;
	private String state;
	private String country;
	private Long pinCode;
	private Long departmentId;
	private Long specializationId;

	public DoctorDto() {
		super();
	}
}
