package com.fleet.pages;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HoverOptionsUnderFleetPage extends BasePage {

    @FindBy(xpath = "//a[@href='entity/Extend_Entity_Carreservation']")
    private WebElement entityCarreseration;

    public HoverOptionsUnderFleetPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //If you need to hover over fleet and click vehicle please use this
    public void VehiclesHoverAndClick() {

        //Instance of actions to use interactions
        Actions actions = new Actions(Driver.getDriver()); //Create instance of Actions to use interactions

        //Initialize webdriver wait
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //wait for visibility
        WebElement fleetMenu = wait.until(ExpectedConditions.visibilityOf(menuOptions.get(1)));

        //hover over fleet menu
        actions.moveToElement(menuOptions.get(1)).perform(); //Hover

        BrowserUtils.sleep(1);

        //locate vehicles
        WebElement vehicleOption = Driver.getDriver().findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']"));

        //click vehicles
        vehicleOption.click();
    }

    //Add yours! (This is only for options when hovering over Fleet)
    //public void VehiclesOdometerHoverAndClick (){}

}
