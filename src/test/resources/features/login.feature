Feature: Login Application

  @TC01
  Scenario: Login to the Application
    Given I go to the Application ""
    When I input the username ""
    And I input the password ""
    And I click on the submit button
    Then Home page gets displayed