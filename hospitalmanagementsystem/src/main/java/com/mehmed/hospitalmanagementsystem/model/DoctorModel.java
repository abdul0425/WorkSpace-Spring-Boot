package com.mehmed.hospitalmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mehmed.hospitalmanagementsystem.configuration.ApplicationConstant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = ApplicationConstant.DOCTOR_DETAILS)
@Data
@AllArgsConstructor
@ToString
public class DoctorModel {

	
	@Id
	@Column(name="doctor_id")
	private Long doctorId;
	@Column(name="doctor_name")
	private String doctorName;
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
	@Column(name="department_id")
	private Long departmentId;
	@Column(name="specialization_id")
	private Long specializationId;

	public DoctorModel() {
		
	}

}
