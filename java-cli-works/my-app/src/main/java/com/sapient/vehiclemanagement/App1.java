package com.sapient.vehiclemanagement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class App1 {
	public static void main(String[] args) {
		// to show map to keep bean classes 
		
		
		HashMap<String, Car> map = new HashMap<String, Car>();
		
		map.put("car1", new Car("Maruti"));
		map.put("car2", new Car("Maruti")); 
		map.put("car3", new Car("Maruti")); 
		
		System.out.println("Map -> " + map);
		

		HashMap<Car, Integer> map1 = new HashMap<Car, Integer>();
		map1.put(new Car("Hyundai"), 4);
		map1.put(new Car("Hyundai"), 4); 
		map1.put(new Car("Hyundai"), 4); 
		map1.put(new Car("Hyundai"), 4); 
		
		System.out.println("Map1 -> " + map1);
		
		
		// the class called String has already implemented 
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("Hello");
		set.add("Hello");
		set.add("Hello");
		set.add("Hello");
		System.out.println(set);
		
		
		Set<Car> carSet = new HashSet<Car>(); 
		carSet.add(new Car()); // NA
		carSet.add(new Car()); // NA
		carSet.add(new Car("Maruti")); 
		carSet.add(new Car("Hyundai")); 
		carSet.add(new Car()); // NA 
		
		for(Car temp : carSet) {
			System.out.println(temp +", " + temp.hashCode());
		}
		
		
		
	}
}
