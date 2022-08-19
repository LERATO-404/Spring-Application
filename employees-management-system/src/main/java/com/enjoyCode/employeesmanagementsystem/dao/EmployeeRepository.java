package com.enjoyCode.employeesmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.enjoyCode.employeesmanagementsystem.model.Employee;

// JpaRepository methods are transactional, so there is no need to add @Transactional annotation in Service class
//@Repository no need as  JpaRepo has the annotation in its implementation
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
	//to test the EmployeeRepository
	@Query(""+
			"SELECT CASE WHEN COUNT(e) > 0 THEN " +
			"TRUE ELSE FALSE END " +
			"FROM Employee e " +
			"WHERE e.email = ?1"
	)
	Boolean selectExistsEmail(String email);
}
