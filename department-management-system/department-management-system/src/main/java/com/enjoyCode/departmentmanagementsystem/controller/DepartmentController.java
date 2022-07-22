package com.enjoyCode.departmentmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
}
