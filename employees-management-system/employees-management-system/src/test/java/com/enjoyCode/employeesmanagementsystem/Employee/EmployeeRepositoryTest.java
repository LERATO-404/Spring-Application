package com.enjoyCode.employeesmanagementsystem.Employee;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.enjoyCode.employeesmanagementsystem.dao.EmployeeRepository;
import com.enjoyCode.employeesmanagementsystem.model.Employee;


@DataJpaTest
public class EmployeeRepositoryTest {
	
	@Autowired
	private EmployeeRepository underTest;
	/*
	@BeforeEach
	void setUp() {
		
	}*/
	
	//after each test delete everything 
	@AfterEach 
	void tearDown(){
		underTest.deleteAll();
	} 
	
	
	@Test
	void itShouldCheckIfEmployeeEmailExist() {
		//test query email
		
		//BDD - Business Driven Development
		String email = "ThomasJ@gmail.com";
		
		//given
		Employee employee = new Employee(
				"Thomas",
				"Jackson",
				email
		);
		// configure to run on h2-database on our database
		underTest.save(employee); // save the student
		
		//when
		boolean expected = underTest.selectExistsEmail(email); // method we are testing
		
	
		//then
		assertThat(expected).isTrue();
	}
	
	@Test
	void itShouldCheckIfEmployeeEmailExistDoesNotExist() {
		
		
		//BDD - Business Driven Development
		//given
		String email = "ThomasJ@gmail.com";
		
		
		//when
		boolean expected = underTest.selectExistsEmail(email); // method we are testing
		
	
		//then
		assertThat(expected).isFalse ();
	}
	
}
