package org.hr.client.controller;

import java.util.List;

import org.hr.client.entity.Employees;
import org.hr.client.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeesService service;
	@RequestMapping("/getEmployees")
	public List<Employees> getEmployee() {
		return service.readEmployeeList();
	}
}
