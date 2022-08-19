package com.enjoyCode.employeesmanagementsystem.Employee;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.enjoyCode.employeesmanagementsystem.dao.EmployeeRepository;
import com.enjoyCode.employeesmanagementsystem.exception.BadRequestException;
import com.enjoyCode.employeesmanagementsystem.model.Employee;
import com.enjoyCode.employeesmanagementsystem.serviceImp.EmployeeServiceImp;


@ExtendWith(MockitoExtension.class)// uncomment AutoCloseable, AfterEach
public class EmployeeServiceTest {
	
	// do not autowire since already tested implementation is good, so mock it
	
	@Mock private EmployeeRepository employeeRepo;
	private EmployeeServiceImp underTest;
	//private AutoCloseable autoCloseable;
	
	@BeforeEach
	void setUp() {
		//initializa all the mock
		//autoCloseable = MockitoAnnotations.openMocks(this);
		underTest = new EmployeeServiceImp(employeeRepo);
	}
	/*
	@AfterEach
	void tearDown() throws Exception{
		autoCloseable.close();
	}
*/
	@Test
	void canGetAllEmployee() {
		
		//when
		underTest.getAllEmployee();
		
		//then
		
		//verify that employeeRepo was invoked using findAll
		verify(employeeRepo).findAll();
		
		//verify(employeeRepo).deleteAll(); this one will fail since deleteAll wasn't used
		
	} 
	
	
	//tests saved students
	@Test
	void canSaveEmployee() {
		
		//given
		Employee employee = new Employee(
					"Thomas",
					"Jackson",
					"ThomasJ@gmail.com"
		);
	
		//when
		underTest.saveEmployee(employee);
		
		//then
		//check that the repo was invoked with the same student parsed
		ArgumentCaptor<Employee> employeeArgumentCaptor = 
				ArgumentCaptor.forClass(Employee.class);
		
		//verify the repo was called/invoked with save method and also capture the actual string parsed inside the save method
		verify(employeeRepo).save(employeeArgumentCaptor.capture());
		
		// capturedEmployee is the one received by the EmployeeService
		Employee capturedEmployee = employeeArgumentCaptor.getValue();
		
		
		//employee is the one the underTest receives
		assertThat(capturedEmployee).isEqualTo(employee);
		
	}
	
	
	//tests already taken email
		@Test
		void willThrowWhenEmailIsTaken() {
			
			//given
			Employee employee = new Employee(
						"Thomas",
						"Jackson",
						"ThomasJ@gmail.com"
			);
			
			
			//continue From 1:09
			// anyString() or employee.getEmail()
			BDDMockito.given(employeeRepo.selectExistsEmail(employee.getEmail())) 
			.willReturn(true);
		
			//when
			//then
			assertThatThrownBy(() ->
				underTest.saveEmployee(employee))
				.isInstanceOf(BadRequestException.class)
				.hasMessageContaining(String.format("Email %s taken", employee.getEmail().toString()));
			
			//verify never save any student (do not execute save method)
			verify(employeeRepo, never()).save(Mockito.any());
			
			
			
		}
	
	@Test
	@Disabled
	void getEmployeeById() {
		
	}
	
	@Test
	@Disabled
	void updateEmployee() {
		
	}
	
	@Test
	@Disabled
	void deleteEmployee() {
		
	}
}

