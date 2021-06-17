package com.sapient.java8;

public class Person implements Comparable<Person> {
	private String name; 
	private String gender; 
	private String martialStatus;
	
	public Person() {}
	
	public Person(String name, String gender, String martialStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.martialStatus = martialStatus;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", martialStatus=" + martialStatus + "]";
	}



	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getGender() {
		return gender;
	}
	protected void setGender(String gender) {
		this.gender = gender;
	}
	protected String getMartialStatus() {
		return martialStatus;
	}
	protected void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	// amit  - ajay  ( 0, 1, -1 ) 
	@Override
	public int compareTo(Person o) {
//		return this.getName().compareTo(o.getName());
		return o.getName().compareTo(this.getName()); 
	} 
	
	
}

















