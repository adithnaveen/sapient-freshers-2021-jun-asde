package com.sapient.tdd;

import com.mycompany.exception.MyRunTimeException;

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
				 Thread.currentThread().interrupt();
			}
			return "Stored " + name;
		}else {
			throw new MyRunTimeException("custom runtime thrown..."); 
		}
	}
}
