package com.sapient.singleton;

public class LazySingleTon {

	private LazySingleTon() {
		System.out.println("LazySingleTon Called");
	}
	
	public static LazySingleTon getInstance(LazySingleTon instance) {
		if(instance == null) {
			return new LazySingleTon(); 
		} 
		return instance; 
	}
	
}
