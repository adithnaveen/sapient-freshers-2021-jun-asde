package com.sapient.vehiclemanagement;

import org.slf4j.LoggerFactory;

import com.mycompany.app.App;

import ch.qos.logback.classic.Logger;

public class Car extends Vehicle{
	private static final Logger log = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Car.class);

	public void doors(int door) {
		log.info("Your car has " + door +" doors");
	}
	
	public void isPowerSteering(boolean isPower) {
		log.info(isPower?"Its Power Steering" : "Mechanical Steering");
	}

	@Override
	public void nuts() {
		log.info("the car nuts are used in car");
	}
	
	
}
