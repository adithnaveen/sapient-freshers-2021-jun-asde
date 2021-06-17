package com.sapient.factory;

// as a factory 
public class Car {

	public static Car getCar(CarNames carName) {
		if(carName.equals(CarNames.BMW)) {
			return new BMW();
		}else if(carName.equals(CarNames.MARUTI)) {
			return new Maruti();
		}else if(carName.equals(CarNames.HYUNDAI)) {
			return new Hyundai();
		}
		return null; 
	}
	
}
