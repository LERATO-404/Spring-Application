package com.enjoyCode.UniversityCourseTracker.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Component // it helps the container identify classes eligible for bean creation
//@Controller // Controller annotation is the parent to @Component,  is is used to mark a class as a  controller, handle web request, and return the page
@RestController // A combination of @Controller and @ResponseBody annotation, is it used for making restful web services - it allows the class to handle the requests made by the client
public class HelloController {
	
	//localhost:8081/hello will show what is returned from method HelloTracker()
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String HelloTracker() {
		return "Hello tracker!!";
	}
}
