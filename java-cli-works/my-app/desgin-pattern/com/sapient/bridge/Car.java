package com.sapient.bridge;

public abstract class Car{
	protected IColor color;
	
	public Car(IColor color) {
		this.color  = color; 
	}
	
	public abstract void applyColor(); 
}
