package com.mehmed.firstspringboot.dto;

import java.io.Serializable;

public class EmployeeUpdateDto implements Serializable{

	private int empId;
	private String contactNumber;
	private double empSalary;
	private String address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeUpdateDto [empId=" + empId + ", contactNumber=" + contactNumber + ", empSalary=" + empSalary
				+ ", address=" + address + "]";
	}
	
	
}
