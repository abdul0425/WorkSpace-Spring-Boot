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

@Data
@Entity
@Table(name = ApplicationConstant.ALLOCATION_DETAILS)
public class AllocationModel implements Serializable{

	@Id
	@GenericGenerator(name = "m_info" , strategy = "increment")
	@GeneratedValue(generator = "m_info")
	@Column(name = "allocation_id")
	private Long allocationId;
	@Column(name = "grant_id")
	private Long grantId;
	@Column(name = "no_of_allocation")
	private Long noOfAllocation;
	@Column(name = "planned_allocation_date")
	private LocalDate plannedAllocationDate;
	@Column(name = "actual_allocation_date")
	private Date actualAllocationDate;
	@Column(name = "allocation_year")
	private Date allocationYear;
	@Column(name = "allocation_status")
	private String allocationStatus;
}
