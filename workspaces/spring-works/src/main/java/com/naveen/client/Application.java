package com.naveen.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naveen.config.ApplicationConfig;
import com.naveen.services.OutputService;

public class Application {
	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		OutputService outputService = context.getBean(OutputService.class); 
		
		outputService.generateOutput();
		
	}

	/*
	 * private static void ver1() { // Object object = hey spring get the object //
	 * version 1 var greetService = new GreetService("Hello"); var timeService = new
	 * TimeService(false); var outpuService = new OutputService(greetService,
	 * timeService);
	 * 
	 * outpuService.generateOutput("Raj"); }
	 */
}
