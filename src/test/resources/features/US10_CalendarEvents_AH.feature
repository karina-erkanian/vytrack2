Feature: Calendar event creation and type in the Description

  Agile story: As a user, I want to type into the “Description” when I create a calendar event.

  Scenario: user is login in to the page

    Then user should see title Login and input username with password

  Scenario: As user is in the homepage, Title "Fleet Management"


    When user is on the homepage

    Then user should see title is Fleet Management

  Scenario: as a user able to see Menu bar and Activities section

    When user is able to see and hower over Activities tap

    Then a pop out Calendar Events appears

    And user able to click on the Calendar Events bar

  Scenario: As a user, appear in new page with SubTitle "Calendar Events"

    When user is in Calendar Events page and sees button Create Calendar Events with date box section

    Then user should see Calendar Events subtitle and blue box with writing Create Calendar Events

  Scenario: as a user, able to click on the crete calendar events button

    When user click on the Create Calendar Events

    Then a new page come out with new subtitle "Create Calendar Event"

    And see all the feature in the page

  Scenario: as a user able to write a titles and descriptions with time stamps

    When user is in the Create Calendar Event page

    Then user able to write a title and description for the event

    And user is able to choose a time specific period or click on the All-Day Event box

  Scenario: as a user, able to click on the Repeat box

    When use is clicking the the Repeat box

    Then use should see a blue check mark and more fuctions of the Repeat sections

    And user is able to choose the begining and end of the repeating cicyle

  Scenario: user creating the calendar event and clicks the Save And Close button

    When user is done with the description and title

    Then able to click on Save And Close button