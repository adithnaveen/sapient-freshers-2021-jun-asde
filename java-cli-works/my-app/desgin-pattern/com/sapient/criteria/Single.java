package com.sapient.criteria;

import java.util.ArrayList;
import java.util.List;

public class Single implements ICriteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> singlePersons = new ArrayList<Person>(); 
		
		for(Person person : persons) {
			if(person.getMartialStatus().equals("single")) {
				singlePersons.add(person);
			}
		}
 		return singlePersons; 
	}
	
}
