package com.fleet.step_definitions;



import com.fleet.pages.BasePage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.US10_calendarDescription_page_AH;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.Before;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.time.Duration;

public class US10_calendarDescription {

    US10_calendarDescription_page_AH US10_calendarDescription = new US10_calendarDescription_page_AH();

    /*@Given("the user logs in as {string}")
    public void theUserLogsInAs(String arg0) {


    }*/




    @Given("the user logs in")
    public void theUserLogsIn() {
        BrowserUtils.sleep(5);
        LoginStepDefs loginStepDefs = new LoginStepDefs();

        loginStepDefs.the_user_logged_in_as("driver");
    }





    @Then("User enter its credentials")
    public void userEnterItsCredentials() {
        BrowserUtils.sleep(5);



        String expectedTitle1 = "Dashboard";

        String actualTitle1 = Driver.getDriver().getTitle();

        BrowserUtils.verifyTitle(expectedTitle1);

        BrowserUtils.sleep(5);
    }



    @When("the user is in the Calendar Event page")
    public void theUserIsInTheCalendarEventPage() {




        BrowserUtils.sleep(5);

        String ActivitiesTab = "Activities";

        String CalendarEventTab = "Calendar Events";

        US10_calendarDescription.navigateToModule(ActivitiesTab, CalendarEventTab);

        BrowserUtils.sleep(5);

        String expectedTitle2 = "Calendar Events";

        String actualTitle = Driver.getDriver().getTitle();

        BrowserUtils.verifyTitle(actualTitle);
    }

    @Then("user should be able to click Create Calendar Events")
    public void user_should_be_able_to_click_create_calendar_events() {
        BrowserUtils.sleep(2);


        US10_calendarDescription.CreateEventBtnClick();

    }

    @When("user is in the Create Calendar Event page")
    public void user_is_in_the_create_calendar_event_page() {
        BrowserUtils.sleep(2);

        US10_calendarDescription.setTitleBox();

        String expectedTitle = "Create Calendar event - Calendar Events - Activities";

        String actualTitle = Driver.getDriver().getTitle();

        BrowserUtils.verifyTitle(expectedTitle);

        Assert.assertEquals(expectedTitle, actualTitle);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title page is matched" + actualTitle);
        } else {
            System.out.println("Title page is not matched");
        }


    }

    @Then("user able to write a title and description for the event")
    public void user_able_to_write_a_title_and_description_for_the_event() {
        BrowserUtils.sleep(2);

        US10_calendarDescription.setDescriptionBox();

        BrowserUtils.sleep(2);

    }

    @When("user is done with the description and title")
    public void user_is_done_with_the_description_and_title() {
        BrowserUtils.sleep(2);

    }

    @Then("able to click on Save And Close button")
    public void able_to_click_on_save_and_close_button() {

        BrowserUtils.sleep(2);

        US10_calendarDescription.SaveAndCloseButtonClick();


    }


    @And("Verify the users description field")
    public void verifyTheUsersDescriptionField() {

       // US10_calendarDescription.VerifyDescription.getText();




    }



}