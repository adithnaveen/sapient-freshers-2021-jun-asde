package com.naveen.client;

import com.naveen.services.GreetService;
import com.naveen.services.OutputService;
import com.naveen.services.TimeService;

public class Application {
	public static void main(String[] args) {
//		Object object =  hey spring get the object 
		// version 1 
		var greetService = new GreetService("Hello "); 
		var  timeService = new TimeService(false); 
		var outpuService = new OutputService(greetService, timeService); 
		
		outpuService.generateOutput("Raj"); 
		
	}
}
