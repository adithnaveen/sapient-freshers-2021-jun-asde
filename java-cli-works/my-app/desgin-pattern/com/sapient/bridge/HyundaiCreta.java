package com.sapient.bridge;

public class HyundaiCreta extends Car{

	public HyundaiCreta(IColor color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Applying color to Hyundai");
		color.applyColor(); 
	}

}
