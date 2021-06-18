package com.sapient.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStep {

	@Given("^the application is loaded on site stacktooflow\\.com$")
	public void the_application_is_loaded_on_site_stacktooflow_com() throws Throwable {
		System.out.println("the application is loaded on site stacktooflow\\\\.com>>>>>");
	}

	@When("^the user clicks on RegButton$")
	public void the_user_clicks_on_RegButton() throws Throwable {
		System.out.println("the user clicks on RegButton>>>>>>>>>>>>");
	}

	@When("^enters user name as \"([a-zA-Z]{1,})\"$")
	public void enters_user_name_as(String name) throws Throwable {
		System.out.println("enters user name as "+name+">>>>");
	}


	@When("^password as \"([a-zA-Z0-9]{1,})\"$")
	public void password_as_secret(String password) throws Throwable {
		System.out.println("password "+password+">>>>> ");
	}

	@Then("^validate the format$")
	public void validate_the_format() throws Throwable {
		System.out.println("validate the format>>>>");
	}

	@Then("^submit it to server$")
	public void submit_it_to_server() throws Throwable {
		System.out.println("submit it to server>>>>>>>>");
	}

}
