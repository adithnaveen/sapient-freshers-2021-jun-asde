package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		log.debug("This is debug log ");
		log.info("This is infor log");
	}
}
