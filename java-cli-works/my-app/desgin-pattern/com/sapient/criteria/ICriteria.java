package com.sapient.criteria;

import java.util.List;

@FunctionalInterface
public interface ICriteria {
	public List<Person> meetCriteria(List<Person> persons);
}
