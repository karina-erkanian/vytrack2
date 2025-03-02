Feature: Verify login with different user types and access Oroinc Documentation

  Background: User is already on the login page
    Given user is on the login page..

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logs in as "<userType>"
    When the user clicks the question mark icon
    Then the user should be navigated to the Oroinc Documentation page

    Examples:
      | userType        |
      | driver         |
      | sales manager  |
      | store manager  |