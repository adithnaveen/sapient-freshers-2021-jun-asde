package com.sapient.absfactory;

// factories are resource intensive 
// preferably make it static 
public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryName) {
		if(factoryName.equalsIgnoreCase("vehicle")) {
			return new VehicleFactory(); 
		}else if(factoryName.equalsIgnoreCase("color")) {
			return new ColorFactory(); 
		}
		return null; 
	}
}
