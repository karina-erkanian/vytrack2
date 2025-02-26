@US05
Feature: Access and view permissions on the vehicles model page
  Agile story: As a user, I want to view columns on the vehicles model page based on my role
  and be restricted from accessing the page if I don't have the proper permissions.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that store manager and sales manager users can see 10 columns on the vehicles model page
    Given the user logged in as "<role>"
    When the user navigates to the vehicles model page
    Then the user should see 10 columns on the vehicles model page

    Examples:
      | role          |
      | sales manager |
      | store manager |



  Scenario: Driver cannot access the vehicles model page and sees a permission error
    Given the user logged in as "driver"
    When the user tries to navigate to the vehicles model page
    Then the user should see an error message "You do not have permission to perform this action"


