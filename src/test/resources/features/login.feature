Feature: Login Application

  Scenario: Login to the Application
    Given I go to the Application
    When I input <_name>
    And I input the <pd>
    And I click on the submit button
    Then Home page gets displayed