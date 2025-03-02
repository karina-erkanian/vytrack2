package com.fleet.step_definitions;

import com.fleet.pages.US08_RecurringCalendarEvent_FA_Page;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Events;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US08_RecurringCalendarEvent_FA_StepDefinitions {

    US08_RecurringCalendarEvent_FA_Page us08RecurringCalendarEventFaPage = new US08_RecurringCalendarEvent_FA_Page();

    @And("user hovers over Activities and clicks on Calendar Events")
    public void userHoversOverActivitiesAndClicksOnCalendarEvents() {
        us08RecurringCalendarEventFaPage.navigateToModule("Activities", "Calendar Events");
        BrowserUtils.waitForVisibility(us08RecurringCalendarEventFaPage.creatCalendarEventBtn, 3);
    }

    @And("user clicks on Create Calendar Event")
    public void userClicksOnCreateCalendarEvent() {
        us08RecurringCalendarEventFaPage.creatCalendarEventBtn.click();
        BrowserUtils.waitFor(2);

    }


    @When("user checks the Repeat checkbox")
    public void userChecksTheRepeatCheckbox() {
        us08RecurringCalendarEventFaPage.RepeatCheckbox.click();
        BrowserUtils.waitFor(2);
    }


    //=============== @US08AC1-2 =============================================================================================================


    @Then("user should see the default number in the Repeat Every field is {string}")
    public void userShouldSeeTheDefaultNumberInTheRepeatEveryFieldIs(String expectedNumber) {
        String actualDefaultNumber = us08RecurringCalendarEventFaPage.RepeatEveryNumber.getAttribute("value");
        System.out.println("actualDefaultNumber = " + actualDefaultNumber);
        Assert.assertEquals(expectedNumber, actualDefaultNumber);

    }
    //=============== @US08AC1-2 =============================================================================================================

    @When("user unchecks the Repeat checkbox")
    public void userUnchecksTheRepeatCheckbox() {

        Assert.assertFalse(us08RecurringCalendarEventFaPage.RepeatCheckbox.isSelected());
    }

    @Then("user should not see the default number in the Repeat Every field is {string}")
    public void userShouldNotSeeTheDefaultNumberInTheRepeatEveryFieldIs(String expectedNumber) {

        Assert.assertFalse(us08RecurringCalendarEventFaPage.RepeatEveryNumber.isDisplayed());

    }

    @Then("user should not see the Repeat Every field and should see {string}")
    public void userShouldNotSeeTheRepeatEveryFieldIsByDefaultNumberOneAndShouldSee(String expectedText) {
        String actualText = us08RecurringCalendarEventFaPage.RemindersText.getText();
        System.out.println("actualText = " + actualText);
        Assert.assertEquals(expectedText, actualText);
    }

    //=============== @US08AC1-3 =============================================================================================================

    /*

    @When("user select any repetition cycle in Repeats input other than {string}")
    public void userSelectAnyRepetitionCycleInRepeatsInputOtherThan(String expectedRepetitionCycle) {

        // Ensure the input is not null or empty
        if (expectedRepetitionCycle == null || expectedRepetitionCycle.isEmpty()) {
            System.out.println("Error: Expected repetition cycle is null or empty.");
            return;
        }

        // Create Select class object and pass the dropdown WebElement
        Select select = new Select(us08RecurringCalendarEventFaPage.DropDownRepeats);

        // Select the appropriate option based on the given expected cycle
        switch (expectedRepetitionCycle) {
            case "Daily":
                select.selectByValue("daily");
                break;
            case "Weekly":
                select.selectByValue("weekly");
                break;
            case "Monthly":
                select.selectByValue("monthly");
                break;
            case "Yearly":
                select.selectByValue("yearly");
                break;
            default:
                System.out.println("Error: Invalid repetition cycle selected - " + expectedRepetitionCycle);
        }


        BrowserUtils.waitFor(8);
    }

        //=============== @US08AC2 =============================================================================================================



    @When("user clear the Repeat Every field and press Enter")
    public void userClearTheRepeatEveryFieldAndPressENTER() {
        us08RecurringCalendarEventFaPage.RepeatEveryNumber.clear();
        us08RecurringCalendarEventFaPage.RepeatEveryNumber.sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(us08RecurringCalendarEventFaPage.errorMsg));

    }


    @Then("user should see the error message {string}")
    public void userShouldSeeTheErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = us08RecurringCalendarEventFaPage.errorMsg.getText();
        System.out.println("actualErrorMessage = " + actualErrorMessage);
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }
*/

    }

