package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("emp")
	public boolean saveEmployee(@RequestBody Employee emp) {
		
		boolean flag = employeeService.saveEmployee(emp);
		return flag;
	}
	
	@GetMapping("emp")
	public List<Employee> getEmployee() {
		
		List<Employee> empList = employeeService.getEmployee();
		return empList;
	}
}
