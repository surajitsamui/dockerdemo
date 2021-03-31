package com.example.dockerdemo.dao;

import com.example.dockerdemo.model.Employee;
import java.util.List;



public interface EmployeeDao {
	List<Employee> getAllEmployees();

	void insertEmployee(Employee employee);
}