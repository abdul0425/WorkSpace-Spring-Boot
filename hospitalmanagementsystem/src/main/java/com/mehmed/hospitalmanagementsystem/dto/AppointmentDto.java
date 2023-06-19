package com.mehmed.hospitalmanagementsystem.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.mehmed.hospitalmanagementsystem.configuration.ApplicationConstant;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class AppointmentDto implements Serializable{

	private Long appointmentId;
	private Long patientId;
	private Long doctorId;
	private Date date;
	private String time;
	private String prescription;
}
