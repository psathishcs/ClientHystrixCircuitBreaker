package org.hr.client.services;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.hr.client.entity.Employees;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class EmployeesService {
	
	@HystrixCommand(fallbackMethod = "readEmployeeListCB")
	public List<Employees> readEmployeeList(){
		URI uri = URI.create("http://localhost:8085/hr/api/employees");
		List<Employees> employees = (List<Employees>) new RestTemplate().getForObject(uri, List.class);
		return employees;
	}
	
	public List<Employees> readEmployeeListCB(){
		List<Employees> employees = new ArrayList<Employees>();
		Employees employee = new Employees();
		employees.add(employee);
		return employees;
	}

}
