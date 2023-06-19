package com.mehmed.firstspringboot.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.firstspringboot.constant.AppConstant;
import com.mehmed.firstspringboot.dto.EmployeeUpdateDto;
import com.mehmed.firstspringboot.entity.Employee;
import com.mehmed.firstspringboot.service.EmployeeService;
import com.mehmed.firstspringboot.service.MySqlService;
import com.mehmed.firstspringboot.service.MySqlServiceImplementation;


@CrossOrigin("*")
@RestController
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@Autowired
	private MySqlService mySql;
	
	private static final Logger lOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	@PostMapping(value=AppConstant.SAVE_EMPLOYEE_DETAILS)
	public void saveEmployeeDetails(@RequestBody Employee employee)
	{
		/*lOGGER.error("Log level: ERROR");
		lOGGER.warn("Log level: WARN");
		lOGGER.info("Log level: INFO");
		lOGGER.debug("Log level: DEBUG");
		lOGGER.trace("Log level: TRACE");*/
		
		service.saveEmployeeDetails(employee);
	}
	
	@GetMapping(value=AppConstant.GET_EMPLOYEE_DETAILS)
	public @ResponseBody List<Employee> getEmployeeDetails()
	{
		lOGGER.error("Log level: ERROR");
		lOGGER.warn("Log level: WARN");
		lOGGER.info("Log level: INFO");
		lOGGER.debug("Log level: DEBUG");
		lOGGER.trace("Log level: TRACE");
		return service.getEmployeeDetails();
	}
	
	@GetMapping(value=AppConstant.FIND_BY_ID)
	public Optional<Employee> findById(int id)
	{
		return service.findById(id);
	}
	
	@PostMapping(value=AppConstant.UPDATE_EMPLOYEES_DETAILS)
	public void saveAllEmployeeDetails(@RequestBody List<Employee> employeeList)
	{
		service.saveAllEmployeeDetails(employeeList);
	}
	
	@PutMapping(value=AppConstant.UPDATE_EMPLOYEE_DETAILS)
	public void updateEmployeeDetails(@Param(value = "empId") int id)
	{
		service.updateEmployeeDetails(id);
	}
	
	@GetMapping(value=AppConstant.GET_EMPLOYEE_BY_ID)
	public @ResponseBody Employee getEmployeeById(@PathVariable(value = "empId") int id)
	{
		return service.getEmployeeById(id);
	}
	
	@PostMapping(value=AppConstant.UPDATE_EMPLOYEES_DTO_DETAILS)
	public void updateEmployeeDetails(@RequestBody List<EmployeeUpdateDto> employeeDtoList)
	{
		service.updateEmployeeDetails(employeeDtoList);
	}
	
	@GetMapping(value=AppConstant.FIND_BY_EMPLOYEE_NAME)
	public @ResponseBody Employee findByEmpName(String name)
	{
		return service.getByEmpName(name);
	}
	
	@GetMapping(value=AppConstant.FIND_BY_EMPLOYEE_NAME_AND_ADDRESS)
	public @ResponseBody Employee findByEmpNameAndAddress(String name,String address)
	{
		return service.findByEmpNameAndAddress(name,address);
	}
	
	@GetMapping(value=AppConstant.FIND_BY_EMPLOYEE_NAME_OR_ADDRESS)
	public @ResponseBody List<Employee> findByEmpNameOrAddress(String name,String address)
	{
		return service.findByEmpNameOrAddress(name,address);
	}
	
	@GetMapping(value=AppConstant.FIND_BY_ADDRESS)
	public @ResponseBody List<Employee> findByAddress(String address)
	{
		return service.findByAddress(address);
	}
	
	@GetMapping(value=AppConstant.FIND_BY_ADDRESS_ORDER_BY_EMP_NAME_ASC)
	public @ResponseBody List<Employee> findByAddressOrderByEmpNameAsc(String address)
	{
		
		return service.findByAddressOrderByEmpNameAsc(address);
	}
	
	@GetMapping(value=AppConstant.FIND_BY_ADDRESS_ORDER_BY_ADDRESS_ASC)
	public @ResponseBody List<Employee> findByAddressOrderByAddressAsc(String address)
	{
		
		return service.findByAddressOrderByAddressAsc(address);
	}
	
	@GetMapping(value=AppConstant.FIND_BY_ADDRESS_ORDER_BY_EMP_SALARY_ASC)
	public @ResponseBody List<Employee> findByAddressOrderByEmpSalaryDsc(String address)
	{
		
		return service.findByAddressOrderByEmpSalaryAsc(address);
	}
	
	
	@GetMapping(value=AppConstant.GET_ALL_EMPLOYEE_RECORDS)
	public @ResponseBody List<Employee> getAllEmployeeRecords()
	{
		return mySql.getAllEmployeeRecords();
	}
	
	@DeleteMapping(value=AppConstant.DELETE_EMPLOYEE_DETAILS)
	public void deleteEmployeeDetails(@PathVariable(value = "empId") int id)
	{
		service.deleteEmployeeDetails(id);
	}
}
