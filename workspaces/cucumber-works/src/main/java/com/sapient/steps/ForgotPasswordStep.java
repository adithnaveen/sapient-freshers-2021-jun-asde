package com.sapient.steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgotPasswordStep {

	@Given("^the site up$")
	public void the_site_up() throws Throwable {

	}

	@When("^check the password forgot for$")
	public void check_the_password_forgot_for(DataTable data) throws Throwable {

		List<Map<String, String>> forgetAccount = data.asMaps(String.class, String.class); 
		
//		System.out.println(forgetAccount.get(0).get("login"));
//		System.out.println(forgetAccount.get(0).get("password"));
		
		
		forgetAccount.forEach((record) -> System.out.println(record));
		
	}

	@Then("^show relevent message$")
	public void show_relevent_message() throws Throwable {

	}

}
