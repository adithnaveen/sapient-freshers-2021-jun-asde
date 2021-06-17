package com.sapient.vehiclemanagement;

import org.slf4j.LoggerFactory;



import ch.qos.logback.classic.Logger;

public class App {
	private static final Logger log = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(App.class);
	public static void main(String[] args) {
		
		Vehicle vehicles [] = new Vehicle[4]; 
		vehicles[0] = new Car(); 
		vehicles[1] = new TwoWheeler();  
		vehicles[2] = new Car(); 
		vehicles[3] = new TwoWheeler(); 
		
		
		for(Vehicle temp : vehicles) {
			VehilceBL.showVehicleDetails(temp);
		}
		
	}
}
