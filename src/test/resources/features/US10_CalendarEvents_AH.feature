
@anusher

Feature: Calendar event creation and type in the Description

  Agile story: As a user, I want to type into the “Description” when I create a calendar event.

#Scenario: Pre conditions

  #Given the user is on the Vytrack login page

  #When the user logs in with username "User1" and password "UserUser123"

  Scenario: Pre conditions to Calendar Description

    Given the user is on the Vytrack login page


    When in log in page

    Then User enter its credentials

    Then user is on the homepage

    Then user should see title is Fleet Management

    When the user navigates to the Calendar Event page

    Then the user clicks on "Create Calendar Event"

    When user is in All Calendar Events page and sees button Create Calendar Events with date box section

    Then user should be able to click Create Calendar Events

    When user is in the Create Calendar Event page

    Then user able to write a title and description for the event

    When user is done with the description and title

    Then able to click on Save And Close button