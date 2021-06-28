package com.naveen.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetService {
	@Value("${application.greeting}")
	private  String greeting;

	public GreetService() {
		super();
		System.out.println("GreetService.GreetService()");
	}

	public String sayGreeting(String name) {
		return greeting + " -> " + name;
	}
	
	public void init() {
		System.out.println("GreetService.init()");
	}
	public void destroy() {
		System.out.println("GreetService.destory()");
	}
}
