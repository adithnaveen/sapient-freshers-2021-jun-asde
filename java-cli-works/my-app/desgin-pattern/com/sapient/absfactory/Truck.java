package com.sapient.absfactory;

public class Truck implements IVehicle {

	@Override
	public void move() {
		System.out.println("Truck is Moving... ");
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("Truck Max Speed is " + maxSpeed);
	}
	
}
