package com.cg.employeemanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employeemanagement.entities.Employee;
import com.cg.employeemanagement.services.IEmployeeServices;

@RestController("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeServices employeeService;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee),HttpStatus.OK);
	}
	@GetMapping("/get")
	public ResponseEntity<List<Employee>> getEmployee(){
		return new ResponseEntity<List<Employee>>(employeeService.getEmployee(),HttpStatus.OK);
	}

}
 