@Sanity @Forgot
Feature: Forgot password test

  Background: 
    Given the site up

  Scenario: 
    When check the password forgot for
      | login     | password     |
      | shushruth | hello        |
      | Rishab    | testing      |
      | sanjana   | testingagain |
    Then show relevent message
