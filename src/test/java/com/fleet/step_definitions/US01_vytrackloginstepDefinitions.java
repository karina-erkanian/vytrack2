package com.fleet.step_definitions;

import com.fleet.pages.vytrackLoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US01_vytrackloginstepDefinitions {

     vytrackLoginPage vytrackLoginPage = new vytrackLoginPage();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));

    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"),
                ConfigurationReader.getProperty("store_manager_password"));
        // Write code here that turns the phrase above into concrete actions
    }
    @When("user enters the username {string} and password {string}")
    public void userEntersTheUsernameAndPassword(String username, String password) {
        vytrackLoginPage.login(username, password);
    }


    @Then("user should be able to login")
    public void userShouldBeAbleToLogin() {
        BrowserUtils.waitForTitleContains("Dashboard");
        Assert.assertEquals("Title verification is failed!","Dashboard",Driver.getDriver().getTitle());

    }

    @When("user enters the sales manager information")
    public void userEntersTheSalesManagerInformation() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"),
                ConfigurationReader.getProperty("sales_manager_password"));

    }

    @When("user enters the driver information")
    public void userEntersTheDriverInformation() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));

    }

    @Then("user should be able to see following modules")
    public void userShouldBeAbleToSeeFollowingModules(List<String> expectedModules) {
        BrowserUtils.waitForTitleContains("Dashboard");
        List<String> actualModules = BrowserUtils.getElementsText(vytrackLoginPage.allModules);
        Assert.assertEquals(expectedModules,actualModules);


    }


}