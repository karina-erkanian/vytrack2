@vytrackLogin
Feature:Users should be able to login
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: driver, sales manager, store manager


  @store_manager
  Scenario: Login as store manager
    When user enters the store manager information
    Then user should be able to login

  @sales_manager
  Scenario: Login as sales manager
   # Given user is on the login page
    When user enters the sales manager information
    Then user should be able to login



  @driver
  Scenario: Login as driver
   # Given user is on the login page
    When user enters the driver information
    Then user should be able to login


  @dataTable
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


  @dataTable
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


  @dataTable
  Scenario: Menu Options for driver
    When user enters the driver information
    Then user should be able to see following modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |



