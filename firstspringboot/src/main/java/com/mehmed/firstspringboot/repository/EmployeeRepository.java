package com.mehmed.firstspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mehmed.firstspringboot.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query("from Employee where empName =:n")
	Employee findByEmpName(@Param("n") String name);

	Employee findByEmpNameAndAddress(String name, String address);

	List<Employee> findByEmpNameOrAddress(String name, String address);

	List<Employee> findByAddress(String address);

	List<Employee> findByAddressOrderByEmpNameAsc(String address);

	List<Employee> findByAddressOrderByAddressAsc(String address);

	List<Employee> findByAddressOrderByEmpSalaryAsc(String address);
}

//public interface EmployeeRepository extends CrudRepository<Employee, Integer>