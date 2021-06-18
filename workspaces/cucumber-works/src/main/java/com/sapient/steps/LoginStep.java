package com.sapient.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@Given("^given application is running$")
	public void given_application_is_running() throws Throwable {
		System.out.println("given application is running>>>>>>>>>>");
	}

	@When("^user enters valid email as \"([^\"]*)\"$")
	public void user_enters_valid_email_as(String arg1) throws Throwable {
		System.out.println(">>>>user enters valid email as " + arg1);
	}

	@When("^password as \"([a-zA-Z0-9])\"$")
	public void password(String password) throws Throwable {
		System.out.println(">>>>password as " + password);
	}

	@Then("^take user to home page$")
	public void take_user_to_home_page() throws Throwable {
		System.out.println("take user to home page>>>>>>>");
	}
}
