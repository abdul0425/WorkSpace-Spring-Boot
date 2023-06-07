package com.mehmed.techbeez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.mehmed.techbeez.dto.EmployeeDto;
import com.mehmed.techbeez.model.EmployeeModel;
import com.mehmed.techbeez.service.EmployeeService;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(value = "/api")
public class EmployeeController {

	public EmployeeService service;
	@Autowired
	public EmployeeController(EmployeeService service) {
		this.service = service;
	}
	@PostMapping(value = "/add-employee")
	public void saveEmployee(@RequestBody EmployeeDto dto) {
		service.saveEmployee(dto);
	}
	
	@GetMapping(value = "/findAll")
	public List<EmployeeModel> getAllEmployee(){
		return service.getAllEmployee();
	}
	@PutMapping(value = "/update/{empId}")
	public void updateEmployee(@RequestBody EmployeeDto dto, @PathVariable("empId") Integer empId) {
		service.updateEmployee(dto,empId);
	}
	@DeleteMapping(value = "/delete/{empId}")
	public void deleteEmployee(@PathVariable("empId") Integer empId) {
		service.deleteEmployee(empId);
	}
	
	@GetMapping("/{empId}")
	public @ResponseBody EmployeeModel getById(@PathVariable("empId") Integer empId) {
		return service.getById(empId);
	}
	
}
