package com.sapient.singleton;

import java.lang.reflect.Constructor;

// to show working with java reflection to by pass singleton 
public class App2 {
	public static void main(String[] args) 
		throws ClassNotFoundException{

		EagerSingleTon esOne = EagerSingleTon.getInstance();
		EagerSingleTon esTwo = null;; 
		EagerSingleTon esThree = null; 
		
		try {
			Constructor constructors [] = EagerSingleTon.class.getDeclaredConstructors();
			
			for(Constructor constructor : constructors) {
				constructor.setAccessible(true);
				esTwo =  (EagerSingleTon) constructor.newInstance();
				esThree =  (EagerSingleTon) constructor.newInstance();
				
				break; 
			}
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		
		System.out.println("esOne : " + esOne.hashCode());
		System.out.println("esTwo : " + esTwo.hashCode());
		System.out.println("esThree : " + esThree.hashCode());
	}
}











