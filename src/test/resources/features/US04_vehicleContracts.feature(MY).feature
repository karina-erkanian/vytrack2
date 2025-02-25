@login
  # User story 4
Feature:  The user should be able to access to Vehicle contracts page

  Background: User is already in the log in page
    Given the user is on the login page
#AC #1: Verify that Store managers and Sales managers can access
# the Vehicle Contracts page.

  Scenario Outline: Store managers can access the Vehicle Contracts page.
    Given the user logged in as "<user>"
    Then  User is able to access the vehicle contracts page

    @wipMY
    Examples:
  | user          |
  | sales manager |
  | store manager |


  Scenario: Driver cannot access the Vehicle Contracts page.
    Given the user logged in as "driver"
    Then  Driver  is  not able to access the vehicle contracts page

