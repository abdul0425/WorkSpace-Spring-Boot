package com.mehmed.validationandexceptionhandle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.mehmed.validationandexceptionhandle.dto.CustomerDto;
import com.mehmed.validationandexceptionhandle.model.CustomerModel;
import com.mehmed.validationandexceptionhandle.repository.CustomerRepository;

@Service
public class CustomerService {

	private CustomerRepository customerRepository;

	@Autowired
	CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public CustomerModel saveCustomer(CustomerDto customerDto) throws MethodArgumentNotValidException {
		CustomerModel customerModel = new CustomerModel();
		customerModel.setCustomerName(customerDto.getCustomerName());
		customerModel.setEmail(customerDto.getEmail());
		customerModel.setAddress(customerDto.getAddress());
		customerModel.setContactNumber(customerDto.getContactNumber());
		customerModel.setSalary(customerDto.getSalary());
		customerModel.setAge(customerDto.getAge());

		customerRepository.save(customerModel);
		return customerModel;

	}

}
