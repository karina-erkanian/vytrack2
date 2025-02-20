package com.fleet.step_definitions;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US10_calendarDescription {

    @Given("user is on the Vytrack Login homepage")
    public void userIsOnTheVytrackHomepage() {

        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
    }


    @Then("user should see title Login and input username with password")
    public void userShouldSeeTitleLoginAndInputUsernameWithPassword() {

        String expectedTitle = "Title";

        BrowserUtils.verifyTitle(expectedTitle);
    }

    @When("user is on the homepage")
    public void user_is_on_the_homepage() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user should see title is Fleet Management")
    public void user_should_see_title_is_fleet_management() {

        BrowserUtils.verifyTitle("Fleet Management");

    }

    @When("user is able to see and hower over Activities tap")
    public void user_is_able_to_see_and_hower_over_activities_tap() {

    }
    @Then("a pop out Calendar Events appears")
    public void a_pop_out_calendar_events_appears() {


    }
    @Then("user able to click on the Calendar Events bar")
    public void user_able_to_click_on_the_calendar_events_bar() {

    }

    @When("user is in Calendar Events page and sees button Create Calendar Events with date box section")
    public void user_is_in_calendar_events_page_and_sees_button_create_calendar_events_with_date_box_section() {

        BrowserUtils.verifyTitle("Create Calendar Events");

    }
    @Then("user should see Calendar Events subtitle and blue box with writing Create Calendar Events")
    public void user_should_see_calendar_events_subtitle_and_blue_box_with_writing_create_calendar_events() {

    }


    @When("user click on the Create Calendar Events")
    public void userClickOnTheCreateCalendarEvents() {

    }

    @Then("a new page come out with new subtitle {string}")
    public void aNewPageComeOutWithNewSubtitle(String arg0) {

        BrowserUtils.verifyTitle("Create Calendar Events");

    }

    @And("see all the feature in the page")
    public void seeAllTheFeatureInThePage() {

    }

    @When("user is in the Create Calendar Event page")
    public void userIsInTheCreateCalendarEventPage() {

    }

    @Then("user able to write a title and description for the event")
    public void userAbleToWriteATitleAndDescriptionForTheEvent() {

    }

    @And("user is able to choose a time specific period or click on the All-Day Event box")
    public void userIsAbleToChooseATimeSpecificPeriodOrClickOnTheAllDayEventBox() {

    }

    @When("use is clicking the the Repeat box")
    public void useIsClickingTheTheRepeatBox() {

    }

    @Then("use should see a blue check mark and more fuctions of the Repeat sections")
    public void useShouldSeeABlueCheckMarkAndMoreFuctionsOfTheRepeatSections() {
    }


    @And("user is able to choose the begining and end of the repeating cicyle")
    public void userIsAbleToChooseTheBeginingAndEndOfTheRepeatingCicyle() {
    }

    @When("user is done with the description and title")
    public void userIsDoneWithTheDescriptionAndTitle() {

    }

    @Then("able to click on Save And Close button")
    public void ableToClickOnSaveAndCloseButton() {
    }



}
