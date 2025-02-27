package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.HoverOptionsUnderFleetPage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.SelectVehicleCheckBoxesPage;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;


public class US07_Select_Vehicle {

    private BasePage basePage;
    LoginPage loginPage = new LoginPage();  //instantiate object

    /*
    @Given("the user is logged in as {string}")
    public void theUserIsLoggedInAs(String arg0) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));  //Open browser

        //Run both sales and store logins. Change in feature class
        if ("sales".equals(arg0)) {
            loginPage.userName.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
            loginPage.password.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
            loginPage.submit.click();
        } else if ("store".equals(arg0)) {
            loginPage.userName.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
            loginPage.password.sendKeys(ConfigurationReader.getProperty("store_manager_password"));
            loginPage.submit.click();
        }

    }

     */


    private HoverOptionsUnderFleetPage hoverOptionsUnderFleetPage = new HoverOptionsUnderFleetPage();

    @When("user hovers over Fleet and clicks on Vehicles")
    public void userHoversOverFleetAndClicksOnVehicles() {

        hoverOptionsUnderFleetPage.VehiclesHoverAndClick();  //Hovering and clicking stored in pages for efficiency
    }

    SelectVehicleCheckBoxesPage selectVehicleCheckBoxesPage = new SelectVehicleCheckBoxesPage();

    @Then("the user should be able to see checkboxes unchecked")
    public void theUserShouldBeAbleToSeeCheckboxesUnchecked() {
        SelectVehicleCheckBoxesPage.checkUnselectedCheckBoxes();
    }

    @Then("the user should be able to select all checkboxes")
    public void theUserShouldBeAbleToSelectAllCheckboxes() {
        SelectVehicleCheckBoxesPage.selectAllCheckBoxes();
    }

    @Then("the user should be able select on any vehicle {int}")
    public void theUserShouldBeAbleSelectOnAnyVehicle(int index) {


        SelectVehicleCheckBoxesPage.selectCheckBox(1);
        SelectVehicleCheckBoxesPage.selectCheckBox(2);
        SelectVehicleCheckBoxesPage.selectCheckBox(3);


    }
}





