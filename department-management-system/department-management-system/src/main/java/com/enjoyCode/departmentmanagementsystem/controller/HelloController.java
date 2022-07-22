package com.enjoyCode.departmentmanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	//@RequestMapping(value = "/", method= RequestMethod.GET)
	@GetMapping("/hello")
	public String helloWorld() {
		return "Welcome to Lerato-404";
	}

}
