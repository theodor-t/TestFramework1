Feature: Login functionality
  As an user
  I want to log into the application
  So that I can access the user dashboard

  Scenario: Successful login
    Given I open the login page
    When I enter valid credentials
    Then I should be redirected to the user dashboard