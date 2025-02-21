@Log
Feature:As a user (sales and store manager), I should be able to
  select any vehicle from the Vehicle page(web table)

  Background: User is already in the log in page
    Given the user is logged in as "sales"


  Scenario:Select any vehicle from the vehicle page
    When user hovers over Fleet and clicks on Vehicles
    Then the user should be able select on any vehicle 3


