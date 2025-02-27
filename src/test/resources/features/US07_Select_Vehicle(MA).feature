@US07
Feature:As a user (sales and store manager), I should be able to
  select any vehicle from the Vehicle page(web table)

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline:Verify that once users are on the Vehicles page, users can see all checkboxes unchecked.
    Given the user logged in as "<role>"
    When user hovers over Fleet and clicks on Vehicles
    Then the user should be able to see checkboxes unchecked

    Examples:
      | role          |
      | sales manager |
      | store manager |

  Scenario Outline:Verify that users can select all checkboxes
    Given the user logged in as "<role>"
    When user hovers over Fleet and clicks on Vehicles
    Then the user should be able to select all checkboxes

    Examples:
      | role          |
      | sales manager |
      | store manager |

  Scenario Outline:Select any vehicle from the vehicle page
    Given the user logged in as "<role>"
    When user hovers over Fleet and clicks on Vehicles
    Then the user should be able select on any vehicle 3
    Examples:
      | role          |
      | sales manager |
      | store manager |



