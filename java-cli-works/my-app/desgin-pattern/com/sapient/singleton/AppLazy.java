package com.sapient.singleton;

public class AppLazy {
	public static void main(String[] args) {
		// since its private it would not work 
//		LazySingleTon ls = new LazySingleTon();
		
		LazySingleTon ls = LazySingleTon.getInstance(null); 
		System.out.println(ls.hashCode());
		
		LazySingleTon ls1 = LazySingleTon.getInstance(ls); 
		System.out.println(ls1.hashCode());
	}
}
