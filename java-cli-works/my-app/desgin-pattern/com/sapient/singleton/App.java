package com.sapient.singleton;

public class App {
	public static void main(String[] args) 
		throws ClassNotFoundException{
		// you cannot create an object of the class directly 
//		EagerSingleTon es = new EagerSingleTon();
		
		EagerSingleTon es = EagerSingleTon.getInstance(); 
		System.out.println(es.hashCode());
		
		EagerSingleTon es1 = EagerSingleTon.getInstance();
		System.out.println(es1.hashCode());
		 
		
		Class.forName("com.sapient.singleton.MyDriver");
			
	}
}
