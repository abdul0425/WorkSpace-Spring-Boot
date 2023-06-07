package com.mehmed.techbeez.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.techbeez.dto.EmployeeDto;
import com.mehmed.techbeez.model.EmployeeModel;
import com.mehmed.techbeez.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

	public EmployeeRepository repository;
	
	@Autowired
	public EmployeeServiceImplementation(EmployeeRepository repository) {
		this.repository = repository;
	}
	
	
	@Override
	public void saveEmployee(EmployeeDto dto) {
		// TODO Auto-generated method stub
		EmployeeModel model = new EmployeeModel();
		model.setEmployeeName(dto.getEmployeeName());
		model.setGender(dto.getGender());
		model.setEmail(dto.getEmail());
		model.setAddress(dto.getAddress());
		model.setContact(dto.getContact());
		
		repository.save(model);
	}

	@Override
	public List<EmployeeModel> getAllEmployee() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void updateEmployee(EmployeeDto dto, Integer empId) {
		// TODO Auto-generated method stub
		Optional<EmployeeModel> optional = repository.findById(empId);
		if(optional.isPresent()) {
			EmployeeModel model = optional.get();
			model.setEmployeeName(dto.getEmployeeName());
			model.setGender(dto.getGender());
			model.setEmail(dto.getEmail());
			model.setAddress(dto.getAddress());
			model.setContact(dto.getContact());
			
			repository.save(model);
		}
	}

	@Override
	public void deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		Optional<EmployeeModel> optional = repository.findById(empId);
		if(optional.isPresent()) {
			repository.deleteById(empId);
		}
	}


	@Override
	public EmployeeModel getById(Integer empId) {
		// TODO Auto-generated method stub
		Optional<EmployeeModel> optional = repository.findById(empId);
		if(optional.isPresent())
			return optional.get();
		return null;
	}

}
