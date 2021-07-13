package com.automation.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/com/automation/userstories"}, 
		glue = {"com.automation.steps"}, 
		plugin = {"pretty", "html:target/cucumber-report", "json:target/first-report.json"}, 
		monochrome = true 
)
public class TestRunner {}
