
@anusher

Feature: Calendar event creation and type in the Description

  Agile story: As a user, I want to type into the “Description” when I create a calendar event.

#Scenario: Pre conditions

  #Given the user is on the Vytrack login page

  #When the user logs in with username "User1" and password "UserUser123"

Scenario: as a user able to logged in

  Given the user logs in





  Scenario: As user is in the homepage, Title "Fleet Management"

    When user is on the homepage

    Then user should see title is Fleet Management



  Scenario: as a user able to see Menu bar and Activities section

    When user is able to see and hover over Activities tap


    Then user able to click on the Calendar Events bar



  Scenario: As a user, appear in new page with SubTitle "All Calendar Events"

    When user is in All Calendar Events page and sees button Create Calendar Events with date box section

    Then user should be able to click Create Calendar Events





  Scenario: as a user able to write a titles and descriptions with time stamps

    When user is in the Create Calendar Event page

    Then user able to write a title and description for the event





  Scenario: user creating the calendar event and clicks the Save And Close button

    When user is done with the description and title

    Then able to click on Save And Close button