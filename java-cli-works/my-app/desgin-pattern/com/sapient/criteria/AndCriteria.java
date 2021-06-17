package com.sapient.criteria;

import java.util.List;

public class AndCriteria implements ICriteria {
	
	private ICriteria first; 
	private ICriteria second; 
	
	public AndCriteria(ICriteria first, ICriteria second) {
		this.first = first; 
		this.second = second; 
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = first.meetCriteria(persons); 
		return second.meetCriteria(list); 
	}
}
