package com.cg.employeemanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employeemanagement.entities.Employee;
import com.cg.employeemanagement.repositories.IEmployeeRepository;

@Service
public class EmployeeImpl implements IEmployeeServices {
	
	@Autowired
	private IEmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> getEmployee() {
		return employeeRepository.findAll(); 
		
	}

}
