package com.mehmed.esop.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class PlanDto implements Serializable {

	private String planYear;

	private LocalDate planStartDate;

	private LocalDate planEndDate;

	private Double vestingFactor;

	private Date vestingDate;

	private boolean activePlan;

	public PlanDto() {

	}
}
