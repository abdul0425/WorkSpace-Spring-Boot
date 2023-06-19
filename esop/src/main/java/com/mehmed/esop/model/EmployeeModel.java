package com.mehmed.esop.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mehmed.esop.constant.ApplicationConstant;

import lombok.Data;

@Data
@Entity
@Table(name = ApplicationConstant.EMPLOYEE_DETAILS)
public class EmployeeModel implements Serializable{

	@Id
	@Column(name = "employee_id")
	private Long employeeId;
	@Column(name = "employee_number")
	private Long employeeNumber;
	@Column(name = "band")
	private Long band;
	@Column(name = "designation")
	private String designation;
	@Column(name = "employee_start_date")
	private String employeeStartDate;
	@Column(name = "is_active")
	private boolean isActive;
	
	
	
	
}
