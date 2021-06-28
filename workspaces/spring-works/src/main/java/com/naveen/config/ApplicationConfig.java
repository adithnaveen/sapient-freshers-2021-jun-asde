package com.naveen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.naveen.services.GreetService;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"com.naveen.services", "com.naveen.aspects"})
@EnableAspectJAutoProxy
public class ApplicationConfig {

//	@Scope(value = "single") // by default
//	@Scope(value = "prototype") // spring will not take care of destruction 
	@Lazy(value = true)
	@Bean(name = "myGreet", initMethod = "init",  destroyMethod = "destroy")
	public GreetService greetService() {
		System.out.println("this is from my greet... ");
		return new GreetService(); 
	}
}


