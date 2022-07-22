package com.enjoyCode.departmentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enjoyCode.departmentmanagementsystem.entity.Department;

//no implementation class but JpaRepositoty because of the JPaRepo methods already provided
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
}
