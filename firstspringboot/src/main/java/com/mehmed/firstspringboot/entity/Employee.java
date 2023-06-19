package com.mehmed.firstspringboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.mehmed.firstspringboot.constant.AppConstant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/*
@AllArgsConstructor
@Setter
@Getter
*/
@Data
@Entity
@Table(name=AppConstant.EMP_INFO)
public class Employee implements Serializable{

	@Id
	@GenericGenerator(name="e_info",strategy = "increment")
	@GeneratedValue(generator = "e_info")
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_salary")
	private double empSalary;
	@Column(name="contact_number")
	private String contactNumber;
	@Column(name="address")
	private String address;
	
	
	/*
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", contactNumber="
				+ contactNumber + ", address=" + address + "]";
	}
	
	*/
	
}
