package com.fleet.step_definitions;

import com.fleet.pages.US09_CalendarEventPage_RA;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US09_errorMessage_RA {

    US09_CalendarEventPage_RA calendarEventPage = new US09_CalendarEventPage_RA();

    @When("the user navigates to the Calendar Event page")
    public void the_user_navigates_to_the_calendar_event_page() {
        calendarEventPage.navigateToCalendarEventPage();
        BrowserUtils.sleep(10);
    }

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String buttonName) {
        calendarEventPage.clickCreateEventButton();
        BrowserUtils.sleep(1);
    }

    @Then("the user checks the recurrence checkbox")
    public void the_user_checks_the_recurrence_checkbox() {
        calendarEventPage.checkRecurrenceCheckbox();
        BrowserUtils.sleep(1);
    }

    @Then("the user sets the recurrence value to {string}")
    public void the_user_sets_the_recurrence_value_to(String value) {
        calendarEventPage.setRecurrenceValue(value);
        BrowserUtils.sleep(1);
        if (Integer.parseInt(value) > 99) {
            Assert.assertTrue("Error message for value > 99 is not displayed!", calendarEventPage.isErrorMessageMoreThan99Displayed());
        } else if (Integer.parseInt(value) < 1) {
            Assert.assertTrue("Error message for value < 1 is not displayed!", calendarEventPage.isErrorMessageLessThan1Displayed());
            BrowserUtils.sleep(1);
        }
    }

    @Then("the user closes the browser")
    public void the_user_closes_the_browser() {
        Driver.closeDriver();
    }
}