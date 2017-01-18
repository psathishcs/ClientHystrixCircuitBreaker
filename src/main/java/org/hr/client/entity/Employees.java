package org.hr.client.entity;

import java.io.Serializable;
import java.util.Date;



public class Employees implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long employeeID;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String job;
	private Double salary;
	private Double commissionPct;
	private Long managerID;
	private Long departmentID;
	
	public Long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(Double commissionPct) {
		this.commissionPct = commissionPct;
	}
	public Long getManagerID() {
		return managerID;
	}
	public void setManagerID(Long managerID) {
		this.managerID = managerID;
	}
	
	public Long getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(Long departmentID) {
		this.departmentID = departmentID;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.employeeID + ", " + this.firstName + ", " + this.lastName;
	}
	
}
