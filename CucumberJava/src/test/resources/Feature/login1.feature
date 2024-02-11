Feature: feature to login functionality

  Scenario: Check login is sucessfull with valid credentials
    Given user is on login page
    When user enter username and password
    And clik on login button
    Then user is navigated to home page
