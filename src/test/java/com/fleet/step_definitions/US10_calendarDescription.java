package com.fleet.step_definitions;



import com.fleet.pages.BasePage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.US10_calendarDescription_page_AH;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.Before;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.time.Duration;

public class US10_calendarDescription {


    @Before
    public void setUp() {

        Driver.getDriver().get("https://qa2.vytrack.com/user/login");

    }

    @Given("the user logs in")
    public void theUserLogsIn() {

    }

    @Then("User enter its credentials")
    public void userEnterItsCredentials() {

        LoginStepDefs loginStepDefs = new LoginStepDefs();

        loginStepDefs.the_user_logged_in_as("driver");
    }

    @Then("user is on the homepage")
    public void user_is_on_the_homepage() {
        BrowserUtils.sleep(2);


    }

    @Then("user should see title is Fleet Management")
    public void user_should_see_title_is_fleet_management() {
        BrowserUtils.sleep(2);




    }

    @When("the user is in the Calendar Event page")
    public void theUserIsInTheCalendarEventPage() {

        String expectedTitle = "Calendar Events - Activities";

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

        US10_calendarDescription_page_AH hoverAndClick = new US10_calendarDescription_page_AH();

        String ActivitiesTab = "Activities";
        String CalendarEventTab = "Calendar Events";

        hoverAndClick.navigateToModule(ActivitiesTab, CalendarEventTab);

        BrowserUtils.sleep(2);
    }




    @Then("user should be able to click Create Calendar Events")
    public void user_should_be_able_to_click_create_calendar_events() {
        BrowserUtils.sleep(2);

        US10_calendarDescription_page_AH CreateCalendarEvents = new US10_calendarDescription_page_AH();

        CreateCalendarEvents.CreateEventBtnClick();

    }

    @When("user is in the Create Calendar Event page")
    public void user_is_in_the_create_calendar_event_page() {
        BrowserUtils.sleep(2);

        String expectedTitle = "Create Calendar event - Calendar Events - Activities";

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

        US10_calendarDescription_page_AH TitleAndDescription = new US10_calendarDescription_page_AH();

        TitleAndDescription.setTitleBox();

    }

    @Then("user able to write a title and description for the event")
    public void user_able_to_write_a_title_and_description_for_the_event() {
        BrowserUtils.sleep(2);

        US10_calendarDescription_page_AH TitleAndDescription = new US10_calendarDescription_page_AH();

        TitleAndDescription.setDescriptionBox();

        BrowserUtils.sleep(2);

    }

    @When("user is done with the description and title")
    public void user_is_done_with_the_description_and_title() {
        BrowserUtils.sleep(2);

    }

    @Then("able to click on Save And Close button")
    public void able_to_click_on_save_and_close_button() {

        BrowserUtils.sleep(2);

        US10_calendarDescription_page_AH SaveAndClose = new US10_calendarDescription_page_AH();

        SaveAndClose.SaveAndCloseButtonClick();


    }


}