package com.fleet.step_definitions;

import com.fleet.pages.HoverOptionsUnderFleetPage;
import com.fleet.pages.US05_vehicleModelPage_KA;
import com.fleet.utilities.BrowserUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class US05_vehicleModel_KA {

    HoverOptionsUnderFleetPage hoverOptionsUnderFleetPage = new HoverOptionsUnderFleetPage();

    @When("the user navigates to the vehicles model page")

    public void the_user_navigates_to_the_vehicles_model_page() {

        hoverOptionsUnderFleetPage.vehiclesModelHoverAndClick();
    }

    US05_vehicleModelPage_KA us05VehicleModelPageKa = new US05_vehicleModelPage_KA();

    @Then("the user should see {int} columns on the vehicles model page")

    public void the_user_should_see_columns_on_the_vehicles_model_page(Integer expectedAmountOfColumns) {

        List<WebElement> columnHeaders = new ArrayList<>();

        columnHeaders.add(us05VehicleModelPageKa.modelNameHeader);
        columnHeaders.add(us05VehicleModelPageKa.makeHeader);
        columnHeaders.add(us05VehicleModelPageKa.canBeRequestedHeader);
        columnHeaders.add(us05VehicleModelPageKa.CVVIHeader);
        columnHeaders.add(us05VehicleModelPageKa.CO2Header);
        columnHeaders.add(us05VehicleModelPageKa.costHeader);
        columnHeaders.add(us05VehicleModelPageKa.totalCostHeader);
        columnHeaders.add(us05VehicleModelPageKa.fuelTypeHeader);
        columnHeaders.add(us05VehicleModelPageKa.vendorsHeader);
        columnHeaders.add(us05VehicleModelPageKa.CO2_EmissionsHeader);

        List<String> expectedColumnHeadersText = List.of("MODEL NAME", "MAKE", "CAN BE REQUESTED", "CVVI", "CO2 FEE (/MONTH)",
                "COST (DEPRECIATED)", "TOTAL COST (DEPRECIATED)", "FUEL TYPE", "VENDORS", "CO2 EMISSIONS");

        List<String> actualColumnHeadersText = new ArrayList<>();

        for (WebElement each : columnHeaders) {

            actualColumnHeadersText.add(each.getText());

        }
        Assert.assertEquals(expectedAmountOfColumns.intValue(), columnHeaders.size());
        Assert.assertEquals(expectedColumnHeadersText, actualColumnHeadersText);
    }

    @When("the user tries to navigate to the vehicles model page")
    public void the_user_tries_to_navigate_to_the_vehicles_model_page() {

        hoverOptionsUnderFleetPage.vehiclesModelhoverAndClickForDrivers();
    }

    @Then("the user should see an error message {string}")
    public void the_user_should_see_an_error_message(String expectedErrorMessage) {

        String actualErrorMessage = us05VehicleModelPageKa.errorMessageForDrivers.getText();


        BrowserUtils.waitFor(2);
        Assert.assertTrue(us05VehicleModelPageKa.errorMessageForDrivers.isDisplayed());

        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
