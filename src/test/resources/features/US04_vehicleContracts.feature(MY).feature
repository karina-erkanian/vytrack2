@login
  # User story 4
Feature:  The user should be able to access to Vehicle contracts page

  Background: User is already in the log in page
    Given the user is on the login page
#AC #1: Verify that Store managers and Sales managers can access
# the Vehicle Contracts page.

  Scenario: Store managers can access the Vehicle Contracts page.
    When  As a store manager enters valid credentials
    Then  User is able to access the vehicle contracts page

  @wipMY
  Scenario: Sales managers can access the Vehicle Contracts page.
    When  As a sales manager enters valid credentials
    Then  User is able to access the vehicle contracts page


  Scenario: Driver cannot access the Vehicle Contracts page.
    When  As a driver enters valid credentials
    Then  Driver  is  not able to access the vehicle contracts page

