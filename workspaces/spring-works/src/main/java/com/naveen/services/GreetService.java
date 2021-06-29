package com.naveen.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.naveen.aspects.Countable;
import com.naveen.aspects.Loggable;

@Service
public class GreetService {
	@Value("${application.greeting}")
	private  String greeting;

	public GreetService() {
		super();
		System.out.println("GreetService.GreetService()");
	}

	@Loggable
	@Countable
	public String sayGreeting(String name) {
		System.out.println("--- i'm in sayGreeting----");
		return greeting + " -> " + name;
	}
	
	public void init() {
		System.out.println("GreetService.init()");
	}
	public void destroy() {
		System.out.println("GreetService.destory()");
	}
}
