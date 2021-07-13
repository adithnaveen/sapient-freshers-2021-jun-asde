package com.automation.steps;

import org.openqa.selenium.WebDriver;

import com.automation.pom.RegistrationPom;
import com.automation.util.Driver;
import com.automation.util.DriverFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegistrationStep {

	private WebDriver driver;
	private String url;
	private RegistrationPom pom;

	public RegistrationStep() {
		driver = DriverFactory.getDriver(Driver.CHROME);
		pom = new RegistrationPom(driver);
		url = "http://elearning.upskills.in/";
	}

	@Given("^the website is up$")
	public void the_website_is_up() {
		driver.get(url);
	}

	@Given("when the user name is \"([a-zA-Z]{0,})\"")
	public void when_the_user_name_is(String name) {
		
		pom.sendFirstName(name);
	}

	@Given("^lastname is \"([a-zA-Z]{0,})\"$")
	public void password_is(String lastname) {
		pom.sendLastName(lastname);
	}

	@Given("^email is \"([^\"]*)\"$")
	public void email_is(String email) throws Throwable {
		pom.sendEmail(email);
	}

	@Given("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
	}

	@Then("^check if user is registered$")
	public void check_if_user_is_registered() throws Throwable {
	}

	@Given("^the driver is loaded$")
	public void the_driver_is_loaded() throws Throwable {
		System.out.println("driver is loaded from factory");
	}

	@Given("^url is \"([^\"]*)\"$")
	public void url_is(String url) throws Throwable {
		this.url = url; 
	}

	@Given("^page is loaded$")
	public void page_is_loaded() throws Throwable {
		driver.get(url);
	}

	@Given("^the registration page$")
	public void the_registration_page() throws Throwable {
		pom.clickRegLink();
	}

}
