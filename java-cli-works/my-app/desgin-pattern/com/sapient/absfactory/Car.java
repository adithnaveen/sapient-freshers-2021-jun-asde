package com.sapient.absfactory;

public class Car implements IVehicle{

	@Override
	public void move() {
		System.out.println("Car is moving");
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("Car max Speed " + maxSpeed);
	}
	
}
