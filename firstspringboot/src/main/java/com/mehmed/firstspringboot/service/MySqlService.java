package com.mehmed.firstspringboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mehmed.firstspringboot.entity.Employee;

@Service
public interface MySqlService {

	public List<Employee> getAllEmployeeRecords();
}
