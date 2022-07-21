package com.enjoyCode.employeesmanagementsystem.serviceImp;


import java.util.List;


import org.springframework.stereotype.Service;

import com.enjoyCode.employeesmanagementsystem.dao.EmployeeRepository;
import com.enjoyCode.employeesmanagementsystem.exception.BadRequestException;
import com.enjoyCode.employeesmanagementsystem.exception.ResourceNotFoundException;
import com.enjoyCode.employeesmanagementsystem.model.Employee;
import com.enjoyCode.employeesmanagementsystem.servicer.EmployeeService;
//@Transactional annotation no needed as spring jpa internally provide transaction to all its methods
@Service
public class EmployeeServiceImp implements EmployeeService {

	//Implement all the method in the EmployeeService interface
	//Setter-based dependency injection - when we have optional parameter
	// Constructor-based dependency injection - when mandatory parameter
	
	private EmployeeRepository employeeRepository;
	
	//@Autowired annotation can be ommitted if a class that is configured as a Spring bean has only one constructor
	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}	
	
	@Override
	public Employee saveEmployee(Employee employee) { // mandatory parameter
		Boolean existsEmail = employeeRepository
				.selectExistsEmail(employee.getEmail()); //selectExistsEmail tested
		if(existsEmail) { 
			throw new BadRequestException(
					String.format("Email %s taken", employee.getEmail().toString()));
		}
		
		// create/save employee REST API
		return employeeRepository.save(employee); 
	}

	@Override
	public List<Employee> getAllEmployee() {
		// find all employees REST API
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		// find employee by id
		//findById returns optional object
		
		
		//using if-statements
		/* 
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}else {
			throw new ResourceNotFoundException("Employee", "Id", id);
		}*/
		
		
		//using lamda expresion
		  return employeeRepository.findById(id).orElseThrow(() -> 
		                         new ResourceNotFoundException("Employee", "Id", id));
		    
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		// update employee
		
		//check whether employee exist
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() ->
		                            new ResourceNotFoundException("Employee", "Id", id));
		//update existing employee
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		// save update employee
		employeeRepository.save(existingEmployee);
		
		return existingEmployee;
	}

	@Override
	public void deleteEmployee(long id) {
		
		//check whether employee exist in DB or not
		employeeRepository.findById(id).orElseThrow(() ->
        							new ResourceNotFoundException("Employee", "Id", id));
		
		
		employeeRepository.deleteById(id);
		
	}
	
	
	
	

}
