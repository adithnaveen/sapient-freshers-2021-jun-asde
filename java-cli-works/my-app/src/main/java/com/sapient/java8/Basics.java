package com.sapient.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Basics {

	public static void main(String[] args) {
		/*
		 * List<String> list = new ArrayList<String>();
		 * 
		 * list.add("Bitan"); list.add("Prateek"); list.add("Rohit"); list.add("Sujaj");
		 * list.add("Hemanth");
		 * 
		 * for (String temp : list) { System.out.println(temp); }
		 * 
		 * list.forEach(
		 * 
		 * new Consumer<String>() {
		 * 
		 * @Override public void accept(String t) { System.out.println("+++" + t); } }
		 * 
		 * );
		 * 
		 * list.forEach((t) -> System.out.println("---" + t));
		 */
		// sorting we can do 1 of 2 fashion
		// 1. implement the class with Comparable
		// 2. use comparator

		// your getting it from the db / file
		List<Person> list1 = new ArrayList<Person>();

		list1.add(new Person("Prateek", "male", "single"));
		list1.add(new Person("Rizwan", "male", "single"));
		list1.add(new Person("Naveen", "male", "married"));
		list1.add(new Person("Aneesha", "female", "single"));
		list1.add(new Person("Kathy", "female", "married"));
		list1.add(new Person("Seema", "female", "single"));

//		Arrays.sort(list1); 
		Collections.sort(list1);
		list1.forEach(System.out::println);

		// this is in decending order
		System.out.println(" in ascending order ");

		Collections.sort(list1, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		list1.forEach(System.out::println);
		
		
		// onlymale list 
		System.out.println("-------- only males list ----------- ");
		List<Person> onlyMalesList = PersonPredicate.filterPersons
					(list1, PersonPredicate.onlyMale());
		
		onlyMalesList.forEach(System.out :: println);
		
		
		System.out.println("-------- only Single list ----------- ");
		
		PersonPredicate.filterPersons
		(list1, PersonPredicate.onlySingle()).forEach(System.out :: println); 
		
		Predicate<Person> maleAndSingle = 
				PersonPredicate.onlyMale().and(PersonPredicate.onlySingle()); 
		
		System.out.println("-------- Male & Single list ----------- ");
		PersonPredicate.filterPersons(list1, maleAndSingle.negate()).forEach(System.out :: println); 

	}
	
	// this will act as our criteria implementation 
	static class PersonPredicate  {
		public static Predicate<Person> onlyMale() {
			return p -> p.getGender().equals("male"); 
		}
		
		public static Predicate<Person> onlySingle() {
			return p -> p.getMartialStatus().equals("single"); 
		}
		
		public static List<Person> filterPersons(List<Person> persons, Predicate<Person> predicate) {
			return persons.stream().filter(predicate).collect(Collectors.toList()); 
		}
		
	}
	
}

























