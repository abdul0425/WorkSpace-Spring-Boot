package com.mehmed.firstspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.mehmed.firstspringboot.entity.Employee;

@Service
public class MySqlServiceImplementation implements MySqlService{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getAllEmployeeRecords() {
		String sqlQuery = "select * from emp_info";
		List listOfEmployee = jdbcTemplate.query(sqlQuery, new BeanPropertyRowMapper(Employee.class));
		return listOfEmployee;
	}
}
	
	/*@Override
	public List<Employee> getAllEmployeeRecords() {
		String sqlQuery = "select * from emp_info";
		//List<Map<String,Object>> list = jdbcTemplate.queryForList(sqlQuery);
		/*
		 * for(Map<String , Object> map:list) { System.out.println(map); }
		 */
		
		
	/*	List<Employee> employeeList = list.stream().map(mapData -> {
			Employee employee = new Employee();
			employee.setEmpId(Integer.parseInt(mapData.get("emp_id").toString()));
			employee.setEmpName(mapData.get("emp_name").toString());
			employee.setEmpSalary(Double.parseDouble(mapData.get("emp_salary").toString()));
			employee.setContactNumber(mapData.get("contact_number").toString());
			employee.setAddress(mapData.get("address").toString());
			return employee;
		}).collect(Collectors.toList());
		
		for (Employee employee2 : employeeList) {
			System.out.println(employee2);
		}
		return employeeList;
	} */
//	}
//
//}
