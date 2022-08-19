package com.enjoyCode.employeesmanagementsystem.servicer;

import java.util.List;

import com.enjoyCode.employeesmanagementsystem.model.Employee;

public interface EmployeeService { 
	Employee saveEmployee(Employee employee); // insert employee
	List<Employee> getAllEmployee(); // get all employees
	Employee getEmployeeById(long id); // get employee by i
	Employee updateEmployee(Employee employee, long id); // update emplyee
	void deleteEmployee(long id); // delete employee
	
}
