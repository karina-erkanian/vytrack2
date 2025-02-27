@manageFilters
Feature: Manage Filters on the Marketing Page
  Agile Story: User should be able to manage filters on the Marketing page

  Background: User is already in the log in page
    Given the user is on the login page

   # Scenario for verifying default filter selections for Store and Sales managers
  Scenario Outline: Verify default filter options
    Given User logged in as a "<User Type>"
    When User is on the Fleet Management main page "Dashboard"
    And User navigates to the Marketing module
    And User clicks Campaigns option according to "<User Type>"
    Then User is on the "All - Campaigns - Marketing" page
    When user navigates Filter button and clicks Manage filters
    Then User sees all filter options checked by default as "<User Type>":
      | Name       |
      | Code       |
      | Start Date |
      | End Date   |
      | Budget     |
      | Tags       |

    And User unchecks the following filters:
      | Name       |
      | End Date |

    Then the unchecked filters should not be selected:
      | Name     |
      | End Date |


    Examples:
      | User Type     |
      | store manager |
      | sales manager |


