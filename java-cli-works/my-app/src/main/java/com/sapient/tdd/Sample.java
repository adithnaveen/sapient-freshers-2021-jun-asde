package com.sapient.tdd;

public class Sample {

	public String sayHi(String name) {
		if(name.length()<4) {
			return null; 
		}
		return "Hi "+ name; 
	}
	
	public String storeEmployee(String name, int age) {
		if(name.equals("naveen")){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Stored " + name;
		}else {
			throw new RuntimeException("Sorry invalid name"); 
		}
	}
}
