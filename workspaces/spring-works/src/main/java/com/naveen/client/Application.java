package com.naveen.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naveen.config.ApplicationConfig;
import com.naveen.services.GreetService;
import com.naveen.services.OutputService;

public class Application {
	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		OutputService outputService = context.getBean(OutputService.class); 		
		outputService.generateOutput();
		
//		GreetService gs = (GreetService) context.getBean("myBean");
		
		GreetService gs = context.getBean("myGreet", GreetService.class); 
		System.out.println(gs);

		gs = context.getBean("myGreet", GreetService.class); 
		System.out.println(gs);


		// the destruction is taken care by spring 
//		context.destroy(); 
		
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
