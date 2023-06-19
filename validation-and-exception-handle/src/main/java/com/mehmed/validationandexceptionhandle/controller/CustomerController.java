package com.mehmed.validationandexceptionhandle.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.validationandexceptionhandle.constant.ApplicationConstant;
import com.mehmed.validationandexceptionhandle.dto.CustomerDto;
import com.mehmed.validationandexceptionhandle.model.CustomerModel;
import com.mehmed.validationandexceptionhandle.service.CustomerService;

@RestController
@RequestMapping(value = ApplicationConstant.CUSTOMER_API)
public class CustomerController {
	
	private CustomerService customerService;
	
	@Autowired
	CustomerController(@Qualifier("customerService") CustomerService customerService){
		this.customerService = customerService;
	}
	
	
	@PostMapping(value = ApplicationConstant.SAVE_CUSTOMER)
	public CustomerModel saveCustomer(@Valid @RequestBody CustomerDto customerDto) throws MethodArgumentNotValidException {
		return customerService.saveCustomer(customerDto);
	}

}
