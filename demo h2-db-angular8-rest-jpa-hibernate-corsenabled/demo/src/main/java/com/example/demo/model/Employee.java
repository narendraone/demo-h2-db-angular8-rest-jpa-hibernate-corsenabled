package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_table")	//optinal
public class Employee {

	@Id
	//@Column(name = "idd") //optinal
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String fName;
	private String lName;
	
	public Employee() {
	
	}
	
	public Employee(Integer empId, String fName, String lName) {
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
	}

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
}
