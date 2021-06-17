package com.sapient.vehiclemanagement;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

// noun - Generic class (abstract / interface) 
public abstract class Vehicle implements IParts {
	private static final Logger log = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Vehicle.class);

	public void move() {
		log.info("Vehicle is Moving");
	}
	
	
	// other methods goes here 
}
