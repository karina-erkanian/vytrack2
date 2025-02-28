package com.fleet.step_definitions;

import com.fleet.pages.US01_vytrackLoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US01_vytrackloginstepDefinitions {

    US01_vytrackLoginPage vytrackLoginPage = new US01_vytrackLoginPage();


    @Given("user is on the login page")
    public void the_user_is_on_the_vytrack_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        //  US01_vytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"),
        //  ConfigurationReader.getProperty("store_manager_password"));
        // Write code here that turns the phrase above into concrete actions
        vytrackLoginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        vytrackLoginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        vytrackLoginPage.loginBtn.click();
        BrowserUtils.sleep(10);
    }


    @Then("user should be able to login")
    public void userShouldBeAbleToLogin() {
        BrowserUtils.sleep(10);
        Assert.assertEquals("Title verification is failed!", "Dashboard", Driver.getDriver().getTitle());

    }

    @When("user enters the sales manager information")
    public void userEntersTheSalesManagerInformation() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"),
                ConfigurationReader.getProperty("sales_manager_password"));


    }

    @When("user enters the driver information")
    public void userEntersTheDriverInformation() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("driver_username"),
                ConfigurationReader.getProperty("driver_password"));

    }

    @Then("user should be able to see following modules")
    public void userShouldBeAbleToSeeFollowingModules(List<String> expectedModules) {
        BrowserUtils.waitForTitleContains("Dashboard");
        List<String> actualModules = BrowserUtils.getElementsText(vytrackLoginPage.allModules);
        Assert.assertEquals(expectedModules, actualModules);
        BrowserUtils.sleep(10);
    }

}



