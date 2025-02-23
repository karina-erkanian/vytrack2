package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.HoverOptionsUnderFleetPage;

import com.fleet.pages.US10_calendarDescription_page_AH;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class US10_calendarDescription {


    @Before
    public void setUp() {

        Driver.getDriver().get("https://qa2.vytrack.com/user/login");


    }

    @Given("the user logs in")
    public void theUserLogsIn() {





    }

    @When("user is on the homepage")
    public void userIsOnTheHomepage() {
    }

    @Then("user should see title is Fleet Management")
    public void user_should_see_title_is_fleet_management() {




        BrowserUtils.verifyTitle("Fleet Management");

    }

    @When("user is able to see and hover over Activities tap")
    public void user_is_able_to_see_and_hover_over_activities_tap() {

   }



    @Then("user able to click on the Calendar Events bar")
    public void user_able_to_click_on_the_calendar_events_bar() throws InterruptedException {

        //locate activities //hover over activities

        US10_calendarDescription_page_AH CalendarDescription = new US10_calendarDescription_page_AH();

        CalendarDescription.ActivitiesTab.wait();


        //locate calendar event and click

        CalendarDescription.CalendarEventLink.click();

        BrowserUtils.sleep(5);

    }



    @When("user is in All Calendar Events page and sees button Create Calendar Events with date box section")
    public void userIsInAllCalendarEventsPageAndSeesButtonCreateCalendarEventsWithDateBoxSection() {

        BrowserUtils.verifyTitle("All Calendar Events");



    }

    @Then("user should be able to click Create Calendar Events")
    public void userShouldBeAbleToClickCreateCalendarEvents() {

        US10_calendarDescription_page_AH CreateCalendarEventBtn = new US10_calendarDescription_page_AH();

        CreateCalendarEventBtn.CreateEventLink.click();

    }


    @When("user is in the Create Calendar Event page")
    public void userIsInTheCreateCalendarEventPage() {


        BrowserUtils.verifyTitle("Create Calendar Events");

    }


    @Then("user able to write a title and description for the event")
    public void userAbleToWriteATitleAndDescriptionForTheEvent() {

        US10_calendarDescription_page_AH CreateCalendarDescription = new US10_calendarDescription_page_AH();

        CreateCalendarDescription.CreateEventLink.click();

    }

    @When("user is done with the description and title")
    public void userIsDoneWithTheDescriptionAndTitle() {

    }

    @Then("able to click on Save And Close button")
    public void ableToClickOnSaveAndCloseButton() {

        US10_calendarDescription_page_AH SaveCalendarDescription = new US10_calendarDescription_page_AH();
        SaveCalendarDescription.SaveAndCloseButton.click();


    }



}
