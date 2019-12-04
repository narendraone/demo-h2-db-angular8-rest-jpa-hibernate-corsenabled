package com.example.demo;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeServiceTests {

	@Autowired
	EmployeeService employeeService;
	
	@Test
	void contextLoads() {
	}

	@Test
	void testSaveEmp() {
		Employee emp = new Employee();
		emp.setfName("Narendra");
		emp.setlName("Chaudhary");
		boolean b = employeeService.saveEmployee(emp);
		
		Assert.assertTrue(b);
		
	}
	
	void testGetEmp() {
		List<Employee> eList = employeeService.getEmployee();
		
		Assert.assertNull(eList);
		Assert.assertEquals("Narendra", eList.get(0).getfName());
	}
}
