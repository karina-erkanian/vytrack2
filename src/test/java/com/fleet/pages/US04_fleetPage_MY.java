package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US04_fleetPage_MY {

    public US04_fleetPage_MY() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(xpath = "//a[.='Vehicle Contracts']")
    public WebElement vehicleContractsLink;

    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement fleetSelection;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement noVehicleContractsPermissionMessage;
}
