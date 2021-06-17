package com.sapient.criteria;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		// your getting it from the db / file 
		List<Person> list = new  ArrayList<Person>(); 
		
		list.add(new Person("Prateek", "male", "single"));
		list.add(new Person("Rizwan", "male", "single")); 
		list.add(new Person("Naveen", "male", "married")); 
		list.add(new Person("Aneesha", "female", "single")); 
		list.add(new Person("Kathy", "female", "married"));
		list.add(new Person("Seema", "female", "single"));
		
		ICriteria male = new Male(); 
		ICriteria single = new Single(); 
		ICriteria maleAndSingle = new AndCriteria(male, single); 
		
		System.out.println("-------- master list ------------");
		list.forEach(System.out :: println);
		
		System.out.println("------------ Only Males--------------");
		male.meetCriteria(list).forEach( (temp) -> System.out.println(temp));
	
		System.out.println("-------- only single ------------- ");
		single.meetCriteria(list).forEach(System.out :: println);
		
		System.out.println("-------- male &  single ------------- ");
		maleAndSingle.meetCriteria(list).forEach(System.out :: println);
		
	}
}
