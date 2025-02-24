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


public class US07_Select_Vehicle {

    private BasePage basePage;
    LoginPage loginPage = new LoginPage();  //instantiate object

    @Given("the user is logged in as {string}")
    public void theUserIsLoggedInAs(String arg0) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));  //Open browser

        //loginPage = new LoginPage();

        //Run both sales and store logins. Change in feature class
        if("sales".equals(arg0)) {
            loginPage.userName.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
            loginPage.password.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
            loginPage.submit.click();
        }else if("store".equals(arg0)) {
            loginPage.userName.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
            loginPage.password.sendKeys(ConfigurationReader.getProperty("store_manager_password"));
            loginPage.submit.click();
        }
    }


    private HoverOptionsUnderFleetPage hoverOptionsUnderFleetPage = new HoverOptionsUnderFleetPage();

    @When("user hovers over Fleet and clicks on Vehicles")
    public void userHoversOverFleetAndClicksOnVehicles() {

        hoverOptionsUnderFleetPage.VehiclesHoverAndClick();  //Hovering and clicking stored in pages for efficiency

        // basePage = new BasePage() {};  //We do this because BasePage is abstract..
        /*
        Actions actions = new Actions(Driver.getDriver()); //Create instance of Actions to use interactions

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement fleetMenu = wait.until(ExpectedConditions.visibilityOf(basePage.menuOptions.get(1)));

        actions.moveToElement(basePage.menuOptions.get(1)).perform(); //Hover

        BrowserUtils.sleep(1);

        WebElement vehicleOption = Driver.getDriver().findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']"));

        vehicleOption.click();

         */

    }

    SelectVehicleCheckBoxesPage selectVehicleCheckBoxesPage = new SelectVehicleCheckBoxesPage();

    @Then("the user should be able select on any vehicle {int}")
    public void theUserShouldBeAbleSelectOnAnyVehicle(int index) {


         SelectVehicleCheckBoxesPage.selectCheckBox(1);
         SelectVehicleCheckBoxesPage.selectCheckBox(2);
         SelectVehicleCheckBoxesPage.selectCheckBox(3);

         //To select All
        //selectVehicleCheckBoxesPage.selectCheckBox(index);





    }



    }

