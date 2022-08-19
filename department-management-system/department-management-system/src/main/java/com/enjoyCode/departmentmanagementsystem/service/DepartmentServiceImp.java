package com.enjoyCode.departmentmanagementsystem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.enjoyCode.departmentmanagementsystem.entity.Department;
import com.enjoyCode.departmentmanagementsystem.exceptions.NotFoundException;
import com.enjoyCode.departmentmanagementsystem.repository.DepartmentRepository;


@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	public DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentById(Long departmentId) {
		
		//return departmentRepository.findById(departmentId).get(); or
		return departmentRepository.findById(departmentId).
									orElseThrow(
											() -> new NotFoundException("department does not exist")
									);
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		
		//check whether department exist in DB or not
		departmentRepository.findById(departmentId).
										orElseThrow(
												() -> new NotFoundException("department does not exist")
										);
		
		departmentRepository.deleteById(departmentId);
	}

	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		Department departmentDB = departmentRepository. findById(departmentId).get();
		return null;
	}

	
	
	
	
}
