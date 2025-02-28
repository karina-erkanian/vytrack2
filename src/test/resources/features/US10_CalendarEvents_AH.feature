
@anusher

Feature: Calendar event creation and type in the Description

  Agile story: As a user, I want to type into the “Description” when I create a calendar event.

#Scenario: Pre conditions



  #When the user logs in with username "User1" and password "UserUser123"

  Scenario: Pre conditions to Calendar Description

    #Given the user logs in as "<user>"

    Given the user logs in

    When the user is in the Calendar Event page

    Then user should be able to click Create Calendar Events

    When user is in the Create Calendar Event page

    Then user able to write a title and description for the event

    When user is done with the description and title

    Then able to click on Save And Close button

    And Verify the users description field