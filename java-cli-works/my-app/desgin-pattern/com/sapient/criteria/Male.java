package com.sapient.criteria;

import java.util.ArrayList;
import java.util.List;

public class Male implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> filteredPerson = new ArrayList<Person>();
		
		for(Person person : persons) {
			if(person.getGender().equals("male")) {
				filteredPerson.add(person);
			} 
		}
		return filteredPerson; 
	}

}
