package com.fleet.step_definitions;

import com.fleet.pages.HoverOptionsUnderFleetPage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.US04_fleetPage_MY;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.Duration;

public class US04_vehicleContracts_stepDefs_MY {
    HoverOptionsUnderFleetPage hoverOptionsUnderFleetPage = new HoverOptionsUnderFleetPage();
    US04_fleetPage_MY fleetPage = new US04_fleetPage_MY();
    LoginPage loginPage = new LoginPage();

    @When("As a store manager enters valid credentials")
    public void as_a_store_manager_enters_valid_credentials() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        loginPage.submit.click();

    }
    @Then("User is able to access the vehicle contracts page")
    public void User_is_able_to_access_the_vehicle_contracts_page() {

        hoverOptionsUnderFleetPage.VehicleContractsHoverAndClick();

        String expectedURL="https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract";
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
        BrowserUtils.sleep(3);
        String expectedTitle= "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals( expectedTitle,actualTitle);
        BrowserUtils.sleep(3);
    }
    @When("As a sales manager enters valid credentials")
    public void as_a_sales_manager_enters_valid_credentials() {
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));
    }

    @When("As a driver enters valid credentials")
    public void as_a_driver_enters_valid_credentials() {
        loginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("driver_password"));
    }
    @Then("Driver  is  not able to access the vehicle contracts page")
    public void driver_is_not_able_to_access_the_vehicle_contracts_page() {
        hoverOptionsUnderFleetPage.VehicleContractsHoverAndClick2();
        BrowserUtils.sleep(3);
        String expectedMessage= "You do not have permission to perform this action.";
        String actualMessage = fleetPage.noVehicleContractsPermissionMessage.getText();
        Assert.assertEquals( actualMessage, expectedMessage);

    }


}
