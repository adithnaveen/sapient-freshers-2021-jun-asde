package com.sapient.vehiclemanagement;

import org.slf4j.LoggerFactory;

import com.mycompany.app.App;

import ch.qos.logback.classic.Logger;

public class Car extends Vehicle{
	private static final Logger log = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Car.class);
	private String carName; 
	
	public Car() {
		this.carName = "NA"; 
	}
	public Car(String carName) {
		this.setCarName(carName); 

	}
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
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + "]";
	}
	// by default it refers to super, every time a object is created 
	// then it refer to object class implementation, 
//	object class implementation give a new hashcode every time 
//	@Override
//	public int hashCode() {
//		return this.carName.charAt(0); 
//	}
//	@Override		// Object obj - is the new entry 
//	public boolean equals(Object obj) {
//		Car temp = (Car) obj; 
//		return this.carName.equals(temp.getCarName());  
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		return true;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
