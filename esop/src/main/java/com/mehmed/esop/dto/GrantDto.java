package com.mehmed.esop.dto;

import java.io.Serializable;

import lombok.Data;

@Data

public class GrantDto implements Serializable{

	private Long grantId;
	private Long employeeNumber;
	private Long numbersOfGrants;
	private Long band;
	private Double grantPrice;
	private String lockInStatus;
	private Long frequency;
	private Long vestingTenure;
	private Long planId;
	
	
	
}
