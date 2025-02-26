package com.fleet.step_definitions;

import com.fleet.pages.HoverOptionsUnderFleetPage;
import com.fleet.pages.US04_fleetPage_MY;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US12_CustomerFilter_StepDefs_MY {


   // HoverOptionsUnderFleetPage hoverOptionsUnderFleetPage = new HoverOptionsUnderFleetPage();
    US04_fleetPage_MY fleetPage = new US04_fleetPage_MY();

    @When("the user hover on Customer module and clicks on customer")
    public void the_user_hover_on_customer_module_and_clicks_on_customer() {
        fleetPage.AccountsHoverAndClick();
        BrowserUtils.sleep(3);
    }
    @Then("User see height filter items on the Accounts page")
    public void user_see_height_filter_items_on_the_accounts_page() {

        List<String> expectedFilters= new ArrayList<>(Arrays.asList("Account Name", "Contact Name", "Contact Email",
                "Contact Phone", "Owner", "Business Unit", "Created At", "Updated At"));

        List<WebElement> actualFilters= fleetPage.filterCriteria;

        for (WebElement eachFilter : actualFilters) {
            Assert.assertTrue(eachFilter.isDisplayed());

        }
        //System.out.println("actualFilters = " + actualFilters);

        for (int i = 0; i < actualFilters.size(); i++) {
          // Assert.assertTrue(actualFilters.get(i).getText().equals(expectedFilters.get(i)));
            //Assert.assertEquals( actualFilters.get(i).getText(), expectedFilters.get(i));
            Assert.assertTrue(actualFilters.get(i).getText().contains(expectedFilters.get(i)));
        }





    }
}
