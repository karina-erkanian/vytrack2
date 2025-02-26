@vytrackLogin
Feature:Users should be able to login
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: driver, sales manager, store manager

  Background:User is already in the login page
    Given user is on the login page


  Scenario: Login as store manager
    # Given user is on the login page
    When user enters the store manager information
    Then user should be able to login


  Scenario: Login as sales manager
   # Given user is on the login page
    When user enters the sales manager information
    Then user should be able to login




  Scenario: Login as driver
   # Given user is on the login page
    When user enters the driver information
    Then user should be able to login



  Scenario: Menu Options for storemanager
    When user enters the store manager information
    Then user should be able to see following modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |



  Scenario: Menu Options for salesmanager
    When user enters the sales manager information
    Then user should be able to see following modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |



  Scenario: Menu Options for driver
    When user enters the driver information
    Then user should be able to see following modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


