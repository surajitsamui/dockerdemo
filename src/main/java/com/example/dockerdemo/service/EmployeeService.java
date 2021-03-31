package com.example.dockerdemo.service;

import com.example.dockerdemo.model.Employee;
import java.util.List;



public interface EmployeeService {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}