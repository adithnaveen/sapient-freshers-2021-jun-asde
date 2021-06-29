package com.naveen.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// URL http://localhost:8080/spring-mvc-works/hello-mvc
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.naveen.controller", "com.naveen.dao"})
public class AppConfig implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context; 
		context = new AnnotationConfigWebApplicationContext(); 
		context.register(AppConfig.class); 
		
		Dynamic servlet = servletContext.addServlet("ds", new DispatcherServlet(context)); 
		servlet.addMapping("/"); 
		servlet.setLoadOnStartup(1);
		
	}
	
}
