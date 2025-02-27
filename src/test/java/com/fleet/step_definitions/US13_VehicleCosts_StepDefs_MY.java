package com.fleet.step_definitions;
import com.fleet.pages.US04_fleetPage_MY;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US13_VehicleCosts_StepDefs_MY {

    US04_fleetPage_MY fleetPage = new US04_fleetPage_MY();

    @When("the user hover on fleet  module and clicks on vehicle costs")
    public void the_user_hover_on_fleet_module_and_clicks_on_vehicle_costs() {
    fleetPage.VehicleCostsHoverAndClick();
        BrowserUtils.sleep(3);
    }
    @When("User should see three columns on the Vehicle Costs page.")
    public void user_should_see_three_columns_on_the_vehicle_costs_page() {

    List<WebElement> threeColones= new ArrayList<>(Arrays.asList(fleetPage.typeColone,fleetPage.totalPriceColone,fleetPage.dateColone));
    List<String> expectedColones= new ArrayList<>(Arrays.asList("TYPE", "TOTAL PRICE", "DATE"));

        for (int i = 0; i < threeColones.size(); i++) {
            Assert.assertEquals(threeColones.get(i).getText(),expectedColones.get(i));
        }

    }


    @Then("User can check the first checkbox to select All Vehicle Costs")
    public void user_can_check_the_first_checkbox_to_select_all_vehicle_costs() {

        fleetPage.typeCheckbox.click();
        Assert.assertTrue(fleetPage.typeCheckbox.isSelected());


        List<WebElement> checkboxesList =new ArrayList<>(Arrays.asList(fleetPage.taxRollCheckbox,fleetPage.depIntCheckbox,fleetPage.taxRoll2Checkbox,
                fleetPage.summerTiresCheckbox,fleetPage.vehicleRegCheckbox));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


        for (WebElement eachBoxSelected : checkboxesList) {
            wait.until(ExpectedConditions.visibilityOf(eachBoxSelected));
            Assert.assertTrue(eachBoxSelected.isSelected());
        }
    }
}
