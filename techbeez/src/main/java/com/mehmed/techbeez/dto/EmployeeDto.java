package com.mehmed.techbeez.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDto implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String employeeName;
	private String gender;
	private String email;
	private String address;
	private String contact;

}
