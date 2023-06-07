package com.mehmed.techbeez.service;

import java.util.List;

import com.mehmed.techbeez.dto.EmployeeDto;
import com.mehmed.techbeez.model.EmployeeModel;

public interface EmployeeService {

	public void saveEmployee(EmployeeDto dto);

	public List<EmployeeModel> getAllEmployee();

	public void updateEmployee(EmployeeDto dto, Integer empId);

	public void deleteEmployee(Integer empId);

	public EmployeeModel getById(Integer empId);
}
