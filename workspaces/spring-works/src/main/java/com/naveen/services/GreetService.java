package com.naveen.services;

public class GreetService {
	private final String greeting; 
	public GreetService(String greeting) {
		this.greeting = greeting; 
	}
	
	public String sayGreeting(String name) {
		return greeting +" -> " + name;
	}
}
