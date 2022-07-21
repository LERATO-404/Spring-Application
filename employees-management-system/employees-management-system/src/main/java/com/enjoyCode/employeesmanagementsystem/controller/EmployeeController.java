package com.enjoyCode.employeesmanagementsystem.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enjoyCode.employeesmanagementsystem.model.Employee;
import com.enjoyCode.employeesmanagementsystem.servicer.EmployeeService;

@RestController
@RequestMapping("/api/employees") //base URL
public class EmployeeController {
	
	//inject EmployeeService
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	 
	//create employee REST API
	// ResponseEntity provide complete   response details, eg status, header etc
	//@RequestBody annotation allows for retrieving the request's body and auto convert it to Java Object
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	//build get all employees REST API
	@GetMapping("/getEmployees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	//build get employee by id REST API
	// {}  dynamic path variable showed match with the augument of the @PathVariable
	@GetMapping("/getEmployees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
	}
	
	//build update employee REST API
	// Response add complete  http status, header
	@PutMapping("/getEmployees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long Id, 
												   @RequestBody Employee employee){
			return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, Id), HttpStatus.OK);
	}
	
	//build delete employee REST API
	@DeleteMapping("/getEmployees/{id}")
	public ResponseEntity<String>  deleteEmployee(@PathVariable("id") long Id){
		// call deleteEmployee method
		employeeService.deleteEmployee(Id);
		
		return new ResponseEntity<String>("Employee deleted successfully", HttpStatus.OK);
	}
}
