package com.mehmed.firstspringboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.firstspringboot.dto.EmployeeUpdateDto;
import com.mehmed.firstspringboot.entity.Employee;
import com.mehmed.firstspringboot.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired 
	private EmployeeRepository repository;
	
	public void saveEmployeeDetails(Employee employee)
	{
		repository.save(employee);
	}

	public List<Employee> getEmployeeDetails() {
		return repository.findAll();
	}

	public Optional<Employee> findById(int id) {
		return repository.findById(id);
	}

	public void saveAllEmployeeDetails(List<Employee> employeeList) {
		repository.saveAll(employeeList);
	}

	public void updateEmployeeDetails(List<EmployeeUpdateDto> employeeDtoList) {
		List<Employee> employeeList = new ArrayList<>();
		employeeDtoList.forEach(employeeDto -> {
			Optional<Employee> optional = repository.findById(employeeDto.getEmpId());
			if(optional!=null)
			{
				Employee employee = optional.get();
				employee.setAddress(employeeDto.getAddress());
				employee.setEmpSalary(employeeDto.getEmpSalary());
				employee.setContactNumber(employeeDto.getContactNumber());
				employeeList.add(employee);
			}
			repository.saveAll(employeeList);
		});
		
	}
	
	public Employee getByEmpName(String name)
	{
		return repository.findByEmpName(name);
	}

	public Employee findByEmpNameAndAddress(String name, String address) {
		return repository.findByEmpNameAndAddress(name,address);
	}

	public List<Employee> findByEmpNameOrAddress(String name, String address) {
		return repository.findByEmpNameOrAddress(name,address);
	}

	public List<Employee> findByAddress(String address) {
		return repository.findByAddress(address);
	}

	public List<Employee> findByAddressOrderByEmpNameAsc(String address) {
		return repository.findByAddressOrderByEmpNameAsc(address);
	}

	public List<Employee> findByAddressOrderByAddressAsc(String address) {
		return repository.findByAddressOrderByAddressAsc(address);
	}

	public List<Employee> findByAddressOrderByEmpSalaryAsc(String address) {
		return repository.findByAddressOrderByEmpSalaryAsc(address);
	}

	public void updateEmployeeDetails(int id) {
		Optional<Employee> optional = findById(id);
		Employee employee = optional.get();
		employee.setEmpName(employee.getEmpName());
		employee.setContactNumber(employee.getContactNumber());
		employee.setEmpSalary(employee.getEmpSalary());
		employee.setAddress(employee.getAddress());
		
		repository.save(employee);
		
		
		
		
		
	}

	public Employee getEmployeeById(int id) {
		return repository.findById(id).get();
	}

	public void deleteEmployeeDetails(int id) {
		
		repository.delete(findById(id).get());
	}
}
