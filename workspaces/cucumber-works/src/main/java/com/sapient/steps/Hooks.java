package com.sapient.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		System.out.println("------ i'm here for all.... ");
	}
	@After
	public void tearDown() {
		System.out.println("----- i'm here aftera all... ");
	}
}
