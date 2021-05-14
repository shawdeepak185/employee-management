package com.cg.employeemanagement.services;

import java.util.List;

import com.cg.employeemanagement.entities.Employee;

public interface IEmployeeServices {
	
	public Employee addEmployee(Employee employee);
	public List<Employee> getEmployee();

}
