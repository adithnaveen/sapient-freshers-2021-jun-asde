package com.sapient.bridge;

public class App {
	public static void main(String[] args) {
		Car hyundaiCreta = new HyundaiCreta(new BlackColor()); 
		hyundaiCreta.applyColor(); 
		
		System.out.println("-----------------------------------");
		Car bmwx1  = new BMWX1(new WhiteColor()); 
		bmwx1.applyColor(); 
		
	}
}
