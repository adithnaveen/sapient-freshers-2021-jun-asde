package com.naveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	// if you pass the string then it will look for the view by that name 
	
	@RequestMapping("/hello-mvc")
	public String sayHello() {
		System.out.println("HelloController.invoked... ");
		return "/WEB-INF/pages/hello.jsp"; 
	}
}
