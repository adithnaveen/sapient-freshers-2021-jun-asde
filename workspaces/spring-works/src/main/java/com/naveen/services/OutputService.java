package com.naveen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OutputService {
	private GreetService greetService;
	private TimeService timeService;

	@Value("${application.name}")
	private String name; 
	
	@Autowired
	public OutputService(GreetService greetService, TimeService timeService) {
		this.greetService = greetService;
		this.timeService = timeService;
	}

	public void generateOutput() {
		System.out.println(greetService.sayGreeting(name) + " at " + timeService.getCurrentTime());
	}
}

