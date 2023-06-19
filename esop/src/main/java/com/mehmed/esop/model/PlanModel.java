package com.mehmed.esop.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.mehmed.esop.constant.ApplicationConstant;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = ApplicationConstant.PLAN_DETAILS)
public class PlanModel implements Serializable {

	@Id
	@GenericGenerator(name = "plan_id",strategy = "increment")
	@GeneratedValue(generator = "plan_id")
	@Column(name = "plan_id")
	private Long planId;
	@Column(name = "plan_year")
	private String planYear;
	@Column(name = "plan_start_date")
	private LocalDate planStartDate;
	@Column(name = "plan_end_date")
	private LocalDate planEndDate;
	@Column(name = "vesting_factor")	
	private Double vestingFactor;
	@Column(name = "vesting_date")
	private Date vestingDate;
	@Column(name = "active_plan")
	private boolean isCurrentPlan;
	
	public PlanModel() {
		
	}

}
