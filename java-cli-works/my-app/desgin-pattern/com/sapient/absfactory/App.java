package com.sapient.absfactory;

public class App {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = FactoryProducer.getFactory("vehicle"); 
		
		IVehicle fordCar = abstractFactory.getVehicle("car"); 
		fordCar.move(); 
		fordCar.speed(120);
		
		IVehicle manTruck = abstractFactory.getVehicle("truck"); 
		manTruck.move(); 
		manTruck.speed(70);
	}
}
