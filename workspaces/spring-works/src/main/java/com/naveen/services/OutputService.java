package com.naveen.services;

public class OutputService {
	private GreetService greetService;
	private TimeService timeService;
	private String name;

	public OutputService(GreetService greetService, TimeService timeService, String name) {
		this.greetService = greetService;
		this.timeService = timeService;
		this.name = name;
	}

	public void generateOutput() {
		System.out.println(greetService.sayGreeting(name) + " at " + timeService.getCurrentTime());
	}
}

