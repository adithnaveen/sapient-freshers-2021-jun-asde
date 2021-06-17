package com.sapient.absfactory;

public class VehicleFactory implements AbstractFactory {

	@Override
	public IVehicle getVehicle(String name) {
		if(name.equalsIgnoreCase("car")) {
			return new Car(); 
		} else if(name.equalsIgnoreCase("truck")) {
			return new Truck(); 
		}
		return null; 
	}

	@Override
	public IColor getColor(String color) {
		return null;
	}

}
