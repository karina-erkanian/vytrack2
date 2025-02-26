package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class US05_vehicleModelPage_KA {

    public US05_vehicleModelPage_KA() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[.='Vehicles Model']")
    public WebElement vehiclesModels;

    @FindBy(xpath = "//table//thead//span[contains(text(),'Model Name')]")
    public WebElement modelNameHeader;

    @FindBy(xpath = "//table//thead//span[contains(text(),'Make')]")
    public WebElement makeHeader;

    @FindBy(xpath = "//table//thead//span[contains(text(),'Can be requested')]")
    public WebElement canBeRequestedHeader;

    @FindBy(xpath = "//table//thead//span[contains(text(),'CVVI')]")
    public WebElement CVVIHeader;

    @FindBy(xpath = "//table//thead//span[contains(text(),'CO2 Fee (/month)')]")
    public WebElement CO2Header;

    @FindBy(xpath = "//table//thead//span[contains(text(),'Cost (Depreciated)')]")
    public WebElement costHeader;

    @FindBy(xpath = "//table//thead//span[contains(text(),'Total Cost (Depreciated)')]")
    public WebElement totalCostHeader;

    @FindBy(xpath = "//table//thead//span[contains(text(),'CO2 Emissions')]")
    public WebElement CO2_EmissionsHeader;

    @FindBy(xpath = "//table//thead//span[contains(text(),'Fuel Type')]")
    public WebElement fuelTypeHeader;

    @FindBy(xpath = "//table//thead//span[contains(text(),'Vendors')]")
    public WebElement vendorsHeader;


    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessageForDrivers;


}
