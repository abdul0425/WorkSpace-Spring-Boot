package com.mehmed.validationandexceptionhandle.dto;


import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Valid
public class CustomerDto{

	@NotNull
	private String customerName;
	@Email(message = "Provide Valid Email Address")
	private String email;
	@NotNull(message = "Address Should Not Be Null .")
	private String address;
	@NotNull(message = "Numbers Are Manadatory .")
	private String contactNumber;
	@Min(value = 18 , message = "Age Should Not be less Than 18 .")
	@Max(value = 45 , message = "Age Should Not be More Than 45 .")
	private int age;
	private Double salary;
}
