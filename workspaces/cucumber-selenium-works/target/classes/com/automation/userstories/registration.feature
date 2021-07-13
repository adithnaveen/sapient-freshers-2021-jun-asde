#Author:naveen@probits.in
Feature: To register user as learner

  Background: 
    Given the driver is loaded
    And url is "http://elearning.upskills.in/"
    And page is loaded

  Scenario: register valid user
    Given the registration page
    And when the user name is "naveen"
    And lastname is "kumar"
    And email is "adith.naveen@gmail.com"
    And click on submit button
    Then check if user is registered
		And close the browser