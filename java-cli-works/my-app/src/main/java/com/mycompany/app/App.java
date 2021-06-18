package com.mycompany.app;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
//import org.slf4j.Logger;
import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

public class App {
	private static final Logger log = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		log.setLevel(Level.ALL);
//		log.setLevel(Level.INFO);
		log.debug("This is debug log ");
		log.info("This is infor log");		
		log.error("in error");
		String myvar = "Hello Var"; 
		log.warn("in warn {}",myvar);
		log.trace("in trace");
	}
}
