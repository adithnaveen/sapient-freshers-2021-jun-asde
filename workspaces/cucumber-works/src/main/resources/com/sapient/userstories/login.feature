@Login @Sanity
Feature: testin for login feature

  Scenario Outline: 
    Given given application is running
    When user enters valid email as "<email>"
    And password as "<password>"
    Then take user to home page

    Examples: 
      | email            | password   |
      | hello@gmail.com  | hello      |
      | naveen@gmail.com | testing123 |
