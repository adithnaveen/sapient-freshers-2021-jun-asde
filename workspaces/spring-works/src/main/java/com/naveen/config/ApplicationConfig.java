package com.naveen.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.naveen.services.GreetService;
import com.naveen.services.OutputService;
import com.naveen.services.TimeService;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

	@Value("${application.greeting}")
	private String greeting; 
	
	@Value("${application.name}")
	private String name; 
	@Value("#{new Boolean(environment['spring.profiles.active']!='dev')}")
	private boolean is24; 
	
	@Autowired
	private TimeService timeService;
	
	@Autowired
	private GreetService greetService; 
	
	@Bean
	public TimeService timeService() {
		return new TimeService(is24); 
	}
	
	
	@Bean
	public GreetService greetService() {
		return new GreetService(greeting); 
	}
	
	@Bean
	public OutputService outpuService() {
		return new OutputService(greetService, timeService, name); 
	}
	
}
