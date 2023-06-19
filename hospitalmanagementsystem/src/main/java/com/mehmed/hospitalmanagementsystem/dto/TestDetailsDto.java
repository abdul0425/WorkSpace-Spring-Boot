package com.mehmed.hospitalmanagementsystem.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import lombok.Data;

@Data
public class TestDetailsDto implements Serializable{

	private Long testId;
	private Long patientId;
	private String patientName;
	private Long appointmentId;
	private Date testDate;
	private Long doctorId;
	private String remarks;
}
