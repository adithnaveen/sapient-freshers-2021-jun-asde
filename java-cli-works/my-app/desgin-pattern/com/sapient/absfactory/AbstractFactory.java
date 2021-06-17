package com.sapient.absfactory;

public interface AbstractFactory {
	IVehicle getVehicle(String name);
	IColor getColor(String color); 
}
