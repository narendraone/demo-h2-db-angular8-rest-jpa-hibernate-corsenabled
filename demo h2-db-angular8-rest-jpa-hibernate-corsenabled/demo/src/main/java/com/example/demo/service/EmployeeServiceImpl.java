package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	
	@Override
	public boolean saveEmployee(Employee emp) {
		Employee save = employeeDAO.save(emp);
		if(save != null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> getEmployee() {
		java.util.List<Employee> empList = employeeDAO.findAll();
		return empList;
	}

	
}
