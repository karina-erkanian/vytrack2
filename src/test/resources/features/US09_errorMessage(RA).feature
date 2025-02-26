@Rachido
Feature: Create Calendar Event with Recurrence

  Scenario: User creates a calendar event with recurrence settings
    Given the user is on the Vytrack login page
    When the user logs in with username and password
    Then the user navigates to the Calendar Event page
    When the user clicks on "Create Calendar Event"
    Then the user checks the recurrence checkbox
    And the user sets the recurrence value to "0"
    And the user sets the recurrence value to "100"
    Then the user closes the browser

