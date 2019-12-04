package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;


@Service
public interface EmployeeService {
	public boolean saveEmployee(Employee emp);
	public List<Employee> getEmployee();
}
