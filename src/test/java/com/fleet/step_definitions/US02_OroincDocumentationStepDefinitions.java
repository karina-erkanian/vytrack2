package com.fleet.step_definitions;

import com.fleet.pages.US02_OroincDocumentationPage;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.Set;


public class US02_OroincDocumentationStepDefinitions {



    US02_OroincDocumentationPage documentationPage = new US02_OroincDocumentationPage();

    WebDriver user = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(user, Duration.ofSeconds(15));



    @Given("the user is on the login page")
    public void user_is_on_login_page() {
        user.get(ConfigurationReader.getProperty("url"));
    }



    @When("the user logs in as {string}")
    public void user_logs_in_as(String userType) {
        String username = "";
        String password = ConfigurationReader.getProperty("driver_password");

        switch (userType.toLowerCase()) {
            case "driver":
                username = ConfigurationReader.getProperty("driver_username");
                break;
            case "sales manager":
                username = ConfigurationReader.getProperty("sales_manager_username");
                break;
            case "store manager":
                username = ConfigurationReader.getProperty("store_manager_username");
                break;
            default:
                throw new IllegalArgumentException("Invalid user type: " + userType);
        }

        documentationPage.login(username, password);
        wait.until(ExpectedConditions.titleContains("Dashboard"));
        Assert.assertTrue("Login failed!", user.getTitle().contains("Dashboard"));
    }


    @When("the user clicks the question mark icon")
    public void user_clicks_question_icon() {
        WebElement icon = wait.until(ExpectedConditions.visibilityOf(documentationPage.questionMarkIcon));
        ((JavascriptExecutor) user).executeScript("arguments[0].scrollIntoView(true);", icon);
        ((JavascriptExecutor) user).executeScript("arguments[0].click();", icon);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }



    @Then("the user should be navigated to the Oroinc Documentation page")
    public void user_should_be_on_documentation_page() {
        switchToNewTab();
        wait.until(ExpectedConditions.urlContains("doc.oroinc.com"));
        Assert.assertEquals("https://doc.oroinc.com/", user.getCurrentUrl());
        Driver.closeDriver();
    }



    private void switchToNewTab() {
        String currentWindow = user.getWindowHandle();
        Set<String> windows = user.getWindowHandles();
        for (String window : windows) {
            if (!window.equals(currentWindow)) {
                user.switchTo().window(window);
                break;

            }
        }
    }
}