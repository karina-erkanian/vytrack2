package com.fleet.step_definitions;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class US09_errorMessage_RA {
    WebDriver driver = Driver.getDriver();

    @Given("the user is on the Vytrack login page")
    public void the_user_is_on_the_vytrack_login_page() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qa2.vytrack.com/calendar/event");
    }

    @When("the user logs in with username {string} and password {string}")
    public void the_user_logs_in(String username, String password) {
        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
        driver.findElement(By.id("_submit")).click();
        BrowserUtils.sleep(10);
    }

    @Then("the user navigates to the Calendar Event page")
    public void the_user_navigates_to_the_calendar_event_page() {
        BrowserUtils.sleep(5);
    }

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String buttonName) {
        WebElement createEventButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a"));
        createEventButton.click();
        BrowserUtils.sleep(10);
    }

    @Then("the user checks the recurrence checkbox")
    public void the_user_checks_the_recurrence_checkbox() {
        WebElement recurrenceCheckbox = driver.findElement(By.xpath("//input[@type='checkbox' and contains(@id, 'recurrence-repeat-view')]"));
        recurrenceCheckbox.click();
        BrowserUtils.sleep(10);
    }

    @Then("the user sets the recurrence value to {string}")
    public void the_user_sets_the_recurrence_value_to(String value) {
        WebElement inputField = driver.findElement(By.cssSelector(".recurrence-subview-control__number"));
        inputField.clear();
        inputField.sendKeys(value);
        BrowserUtils.sleep(10);
        if (Integer.parseInt(value) > 99) {
            WebElement errorMessage = driver.findElement(By.xpath("//span[text()='The value have not to be more than 99.']"));
            Assert.assertTrue("Error message for value > 99 is not displayed!", errorMessage.isDisplayed());
        } else if (Integer.parseInt(value) < 1) {
            WebElement errorMessage = driver.findElement(By.xpath("//span[text()='The value have not to be less than 1.']"));
            Assert.assertTrue("Error message for value < 1 is not displayed!", errorMessage.isDisplayed());
            BrowserUtils.sleep(10);
        }
    }

    @Then("the user closes the browser")
    public void the_user_closes_the_browser() {
        Driver.closeDriver();
    }
}
