Feature: Login Application
Login to the Application


  Background: Launching Application
    Scenario Outline: Login to the Application with valid user name and password
      Given I am on the Application Login page
      When I input the username "<username>"
      And I input the password "<password>"
      And I click on the submit button
      Then Home page gets displayed

      Examples:
      |username|password|
      |Admin   |admin123|
#
#      Scenario: Add Employee into the Application
#        When I click on the Add Employee button
#        Then Employee form gets displayed
#        And I input the First Name

