package com.mehmed.validationandexceptionhandle.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mehmed.validationandexceptionhandle.constant.ApplicationConstant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = ApplicationConstant.CUSTOMER)
public class CustomerModel{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long customerId;
	@Column(name = "customer_name")
	private String customerName;
	private String email;
	private String address;
	@Column(name = "contact_number")
	private String contactNumber;
	private int age;
	private Double salary;
}
