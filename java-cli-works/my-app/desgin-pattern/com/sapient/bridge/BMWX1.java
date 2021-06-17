package com.sapient.bridge;

public class BMWX1 extends Car {

	public BMWX1(IColor color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Applying color to BMW X1");
		color.applyColor(); 
	}

}
