
  # User story 12
  Feature:  As a user (store and sales manager), I want to filter customers’ info on
    the Accounts page.

    Background: User is already in the log in page
      Given the user is on the login page
#AC #1: Verify that users see 8 filter items on the Accounts page
@WipMY12
    Scenario Outline: Store managers and sales managers can see 8 filters.
      Given the user logged in as "<user>"
      When the user hover on Customer module and clicks on customer
      Then  User see height filter items on the Accounts page

      Examples:
        | user          |
        | sales manager |
        | store manager |