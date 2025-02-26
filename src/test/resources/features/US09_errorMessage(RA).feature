@Rachido
Feature: Create Calendar Event with Recurrence

  Background: User is already on the login page

  Scenario Outline: User creates a calendar event with recurrence settings
    Given the user logged in as "<role>"
    When the user navigates to the Calendar Event page
    Then the user clicks on "Create Calendar Event"
    And the user checks the recurrence checkbox
    And the user sets the recurrence value to "0"
    And the user sets the recurrence value to "100"
    Then the user closes the browser

    Examples:
      | role          |
      | driver        |
      | sales manager |
      | store manager |