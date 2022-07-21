 package com.enjoyCode.UniversityCourseTracker.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.enjoyCode.UniversityCourseTracker.entity.Person;


@RestController
public class PersonController {
	
	@PostMapping("/persons")
	public Person savePerson(@RequestBody Person person) {
			
		return person;
		
	}
}