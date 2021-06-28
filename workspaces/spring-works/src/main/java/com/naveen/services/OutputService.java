package com.naveen.services;

public class OutputService {
	private GreetService greetService; 
	private TimeService timeService; 
	
	public OutputService(GreetService greetService, TimeService timeService) {
		this.greetService = greetService; 
		this.timeService = timeService;
	}
	
	public void generateOutput(String name) {
		
		System.out.println(greetService.sayGreeting(name) +" at " + timeService.getCurrentTime());  
	}
}
