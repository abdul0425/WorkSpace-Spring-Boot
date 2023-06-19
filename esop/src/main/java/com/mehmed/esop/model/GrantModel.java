package com.mehmed.esop.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mehmed.esop.constant.ApplicationConstant;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = ApplicationConstant.GRANT_DETAILS)
@ToString
public class GrantModel implements Serializable{

	@Id
	@Column(name = "grant_id")
	private Long grantId;
	@Column(name = "employee_number")
	private Long employeeNumber;
	@Column(name = "numbers_of_grants")
	private Long numbersOfGrants;
	@Column(name = "band")
	private Long band;
	@Column(name = "grant_price")
	private Double grantPrice;
	@Column(name = "grant_status")
	private String grantStatus;
	@Column(name = "accepted")
	private Boolean accepted;
	@Column(name = "accepted_date")
	private Date acceptedDate;
	@Column(name = "lock_in_status")
	private String lockInStatus;
	@Column(name = "frequency")
	private Long frequency;
	@Column(name = "vesting_tenure")
	private Long vestingTenure;
	@Column(name = "allocation_status")
	private String allocationStatus;
	@Column(name = "plan_id")
	private Long planId;
	
	
	
	
}
