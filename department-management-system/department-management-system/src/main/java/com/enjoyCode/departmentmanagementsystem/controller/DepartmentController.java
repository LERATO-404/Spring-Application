package com.enjoyCode.departmentmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enjoyCode.departmentmanagementsystem.entity.Department;
import com.enjoyCode.departmentmanagementsystem.service.DepartmentService;

@RestController
public class DepartmentController {

	//DepartmentService departmentService= = new DepartmentService(); do not use this look why
	@Autowired
	private DepartmentService departmentService;
	
	//method to save a department
	//RequestBody whatever data convert it to department object -- look into
	@PostMapping("/savedepartments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		return departmentService.fetchDepartmentList();
	}
	
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.fetchDepartmentById(departmentId);
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		
		departmentService.deleteDepartmentById(departmentId);
		
		return "Department deleted successfully";
	}
	
}
