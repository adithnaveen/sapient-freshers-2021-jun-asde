# this is my Comment
# Author : Naveen
@Registration @Sanity
Feature: registring user to the application - StackTooFlow

  Scenario: 
    Given the application is loaded on site stacktooflow.com
    When the user clicks on RegButton
    And enters user name as "Hemanth"
    And password as "secret123"
    Then validate the format
    And submit it to server

  Scenario: 
    Given the application is loaded on site stacktooflow.com
    When the user clicks on RegButton
    And enters user name as "Priyadarshan"
    And password as "hello123"
    Then validate the format
    And submit it to server

	@LoginAkhil
  Scenario: 
    Given the application is loaded on site stacktooflow.com
    When the user clicks on RegButton
    And enters user name as "Akhil"
    And password as "try123"
    Then validate the format
    And submit it to server
