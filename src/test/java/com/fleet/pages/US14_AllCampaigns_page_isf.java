package com.fleet.pages;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US14_AllCampaigns_page_isf extends BasePage{

    public US14_AllCampaigns_page_isf(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    // Hover over Marketing Module(isf)
    @FindBy(xpath = "//div[@id='main-menu']/ul/li[6]")
    public WebElement marketingMenu;

    // Click to Campaigns Page as Store Manager
    @FindBy(xpath = "//div[@id='main-menu']/ul/li[6]//li[3]")
    public WebElement clickToCampaignsStore;


    // Click to Campaigns Page as Sales Manager
    @FindBy(xpath = "//span[.='Campaigns']")
    public WebElement clickToCampaignsSales;


    // Locate Filter Symbol for visibility
    @FindBy(xpath = "//div[@class='pull-right grid-toolbar-tools']/div[1]/div/a[1]")
    public WebElement filterSymbol;


    // Click to Manage Filters
    @FindBy(xpath = "//div[@class='filter-box oro-clearfix-width']//button")
    public WebElement filtersButton;


    // checked Filter Manage by Default
    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li")
    public WebElement checkedFilterDefault;

    // for verifying selected Filter options
    public void verifySelectedDropdownOptions(List<String> expectedOptions, String userRole){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(filtersButton));

       // List of WebElements of Selected Filter options
        List<WebElement> selectedOptions = filtersButton.findElements(By.xpath("//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li"));

        // Actual List -> coming from App
        List<String> actualOptions = new ArrayList<>();

        // iterate to get the Text of the selected Filter options
        for (WebElement eachOption : selectedOptions) {
            actualOptions.add(eachOption.getText().trim());
        }

        // Convert userRole from feature file format ("store manager") to actual username ("storemanager63")
        if (userRole.equalsIgnoreCase("store manager")) {
            userRole = "storemanager63";
        } else if (userRole.equalsIgnoreCase("sales manager")) {
            userRole = "salesmanager263";
        }


        // Create a modifiable list from expected Options (Store Manager)
        List<String> modifiableExpectedOptions = new ArrayList<>(expectedOptions);

        // Modify expected options if user is a Store Manager
        if (userRole.equalsIgnoreCase("storemanager63")) {
            modifiableExpectedOptions.remove("Tags"); // Adjust based on user role
        }

        // Assertion
        Assert.assertEquals("Mismatch in selected dropdown options", modifiableExpectedOptions, actualOptions);
    }



    // Click to filter symbol to make "Manage Filter" visible
    public void filterLocatorAndManage(){
        filterSymbol.click();
        BrowserUtils.sleep(2);

        filtersButton.click();

        BrowserUtils.sleep(2);

    }



    // Each User Role -> different locators for same Location
    public WebElement getCampaignsLocator(String userRole) {

        // Normalize userRole to match the actual usernames
        if (userRole.equalsIgnoreCase("store manager")) {
            userRole = "storemanager63";  // Map "store manager" to the correct username
        } else if (userRole.equalsIgnoreCase("sales manager")) {
            userRole = "salesmanager263";  // Map "sales manager" to the correct username
        }


        if ("storemanager63".equals(userRole)) {
            return clickToCampaignsStore;
        } else if ("salesmanager263".equals(userRole)) {
            return clickToCampaignsSales;
        } else {
            throw new IllegalArgumentException("User role not recognized: " + userRole);
        }
    }

    // uncheck given Filters
    public void unchecksFilters(List<String> filtersToUncheck){

        for (String filterEach : filtersToUncheck){
            WebElement checkbox = Driver.getDriver().findElement(By.xpath("//input[@title='"+ filterEach + "']"));

            // If the checkbox is checked, click it to uncheck
            if (checkbox.isSelected()) {
                checkbox.click();

            }
        }

    }

    // verify unchecked given Filters
    public void verifyUnchecksFilters(List<String> filtersToUncheck){

        for (String filterEach : filtersToUncheck){
            WebElement checkbox = Driver.getDriver().findElement(By.xpath("//input[@title='"+ filterEach + "']"));

            // If the checkbox is checked, click it to uncheck
            if (checkbox.isSelected()) {
                checkbox.click();

                Assert.assertTrue("Checkbox for '" + filterEach + "' is still checked!", !checkbox.isSelected());
            }
        }

    }



}
