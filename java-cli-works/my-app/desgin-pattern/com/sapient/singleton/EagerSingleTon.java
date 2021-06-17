package com.sapient.singleton;

// we need single instance 
public class EagerSingleTon {
	
	private static EagerSingleTon eagerSingleTon = new EagerSingleTon(); 
	private EagerSingleTon() {
			System.out.println("you called Eager Single Ton");
	}
	public static EagerSingleTon getInstance() {
		return eagerSingleTon; 
	}
}
