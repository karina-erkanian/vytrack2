#User story 12
Feature:  As a user (store and sales manager), I want to filter customers’ info on
  the Accounts page.

  Background: User is already in the log in page
    Given the user is on the login page
#AC #1: Verify that users see 8 filter items on the Accounts page
  @WipMY13
  Scenario Outline: Store and Sales managers should be able to manage filters on the
  Vehicle Costs page.
    Given the user logged in as "<user>"
    When the user hover on fleet  module and clicks on vehicle costs
    And  User should see three columns on the Vehicle Costs page.
    Then User can check the first checkbox to select All Vehicle Costs
    Examples:
      | user          |
      | sales manager |
      | store manager |