package com.fleet.step_definitions;

import com.fleet.pages.*;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US14_ManagingFilters_stepDef_isf  {

    // For Log in -> Used LoginPage Object
    LoginPage loginPage = new LoginPage();


    // hover over -> Marketing Menu option
    HoverOptionsUnderFleetPage hoverOptions = new HoverOptionsUnderFleetPage();

    // Go to Campaigns Object
    US14_AllCampaigns_page_isf campaignsPage = new US14_AllCampaigns_page_isf();

    // Create an instance of LoginStepDefs first
    LoginStepDefs loginStepDefs = new LoginStepDefs();


    // Log in with valid credentials
    @Given("User logged in as a {string}")
    public void userLoggedInAsA(String userType) {

        loginStepDefs.the_user_logged_in_as(userType);

    }


    // confirm Main page
    @Given("User is on the Fleet Management main page {string}")
    public void user_is_on_the_fleet_management_main_page(String expectedText) {

            String actualTitle = campaignsPage.getPageSubTitle();

            Assert.assertEquals(expectedText, actualTitle);

    }


    //Marketing module menu
    @And("User navigates to the Marketing module")
    public void user_navigates_to_the_marketing_module() {
        campaignsPage.marketingMenu.click();

        BrowserUtils.sleep(3);
    }


    // Click to Campaigns option
    @And("User clicks Campaigns option according to {string}")
    public void userClicksCampaignsOptionAccordingTo(String userRole) {

        campaignsPage.getCampaignsLocator(userRole).click();
    }



    // Verifying Campaigns Page
    @And("User is on the {string} page")
    public void userIsOnThePage(String campaignsPage) {

        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitleContains(campaignsPage);
        //BrowserUtils.sleep(3);

    }


    // Display Filter Manager
    @When("user navigates Filter button and clicks Manage filters")
    public void userNavigatesFilterButtonAndClicksManageFilters() {

        campaignsPage.filterLocatorAndManage();

    }


    // Verify all Filter Options checked by Default
    @Then("User sees all filter options checked by default as {string}:")
    public void userSeesAllFilterOptionsCheckedByDefaultAs(String userRole, List<String> expectedOptions) {

        campaignsPage.verifySelectedDropdownOptions(expectedOptions, userRole);

    }

    // Unchecks the following Filters
    @And("User unchecks the following filters:")
    public void userUnchecksTheFollowingFilters(List<String> filtersToUncheck) {

        campaignsPage.unchecksFilters(filtersToUncheck);

    }


    @Then("the unchecked filters should not be selected:")
    public void theUncheckedFiltersShouldNotBeSelected(List<String> filtersToUncheck) {
        BrowserUtils.sleep(3);
        campaignsPage.verifyUnchecksFilters(filtersToUncheck);



    }


}
