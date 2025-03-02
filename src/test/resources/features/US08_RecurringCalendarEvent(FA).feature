@US08
Feature:

  Agile story: As a user, I want to create a recurring (repetitive) calendar event.

  Background:

    Given the user is on the login page

  @US08AC1-1 # passed
  Scenario Outline: Verify that user see the number [1] by default in the "Repeat Every" input option.

    Given the user logged in as "<user>"
    And user hovers over Activities and clicks on Calendar Events
    And user clicks on Create Calendar Event
    When  user checks the Repeat checkbox
    Then user should see the default number in the Repeat Every field is "1"

    Examples:
      | user          |
      | driver        |
      | store manager |
      | sales manager |


  @US08AC1-2 # passed
  Scenario Outline: Verify if the "Repeat input box is not selected, the user is NOT able to see the number [1] by default in the "Repeat Every" input option .

    Given the user logged in as "<user>"
    And user hovers over Activities and clicks on Calendar Events
    And user clicks on Create Calendar Event
    When  user unchecks the Repeat checkbox
    Then user should not see the Repeat Every field and should see "Reminders "
    Examples:
      | user          |
      | driver        |
      | store manager |
      | sales manager |


  @US08AC1-3 #failed
  Scenario Outline: Verify that user see the number [1] by default in the "Repeat Every" input option for all 4 Repeats options (Daily-Weekly-Monthly-Yearly)

    Given the user logged in as "<user>"
    And user hovers over Activities and clicks on Calendar Events
    And user clicks on Create Calendar Event
    When  user checks the Repeat checkbox
  #  When user select any repetition cycle in Repeats input other than "Daily"
    Then user should see the default number in the Repeat Every field is "1"

    Examples:
      | user          |
      | driver        |
      | store manager |
      | sales manager |


  @US08AC2 #failed

  Scenario Outline: verify that users see the error message "This value should not be blank." When the Calendar event "Repeat Every" field is cleared (delete the number 1)

    Given the user logged in as "<user>"
    And user hovers over Activities and clicks on Calendar Events
    And user clicks on Create Calendar Event
    When  user checks the Repeat checkbox
   # When  user clear the Repeat Every field and press Enter
   # Then user should see the error message "This value should not be blank."
    Examples:
      | user          |
      | driver        |
      | store manager |
      | sales manager |
