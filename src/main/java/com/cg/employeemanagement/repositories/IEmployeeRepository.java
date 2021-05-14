package com.cg.employeemanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.employeemanagement.entities.Employee;

public interface IEmployeeRepository extends JpaRepository<Integer, Employee> {

}
