package com.sapient.absfactory;

public class ColorFactory implements AbstractFactory {

	@Override
	public IVehicle getVehicle(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getColor(String color) {
		if(color.equals("red")) {
			return new RedColor(); 
		}else if(color.equals("blue")) {
			return new BlueColor(); 
		}
		return null; 
	}

}
