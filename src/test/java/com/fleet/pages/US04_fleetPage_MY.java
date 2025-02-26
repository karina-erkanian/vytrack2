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
import java.util.List;

public class US04_fleetPage_MY extends HoverOptionsUnderFleetPage {

    public US04_fleetPage_MY() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(xpath = "//a[.='Vehicle Contracts']")
    public WebElement vehicleContractsLink;

    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement fleetSelection;

    @FindBy(xpath = "((//span[@class='title title-level-1'])[3]")
    public WebElement CustomerSelection;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement noVehicleContractsPermissionMessage;


    public void AccountsHoverAndClick() {
        //Instance of actions to use interactions
        Actions actions = new Actions(Driver.getDriver()); //Create instance of Actions to use interactions

        //Initialize webdriver wait
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        for (WebElement menuOption : menuOptions) {//
            //wait for visibility
             wait.until(ExpectedConditions.visibilityOf(menuOption));

            if (menuOption.getText().equals("Customers")) {
                //hover over Customers menu
                actions.moveToElement(menuOption).perform(); //Hover
                BrowserUtils.sleep(1);
                //locate Accounts

                WebElement accountsOption = Driver.getDriver().findElement(By.xpath("//a[@href='/account']//span[.='Accounts']"));
                accountsOption.click();
                WebElement accountsFilter = Driver.getDriver().findElement(By.xpath("//i[@class='fa-filter hide-text']"));
                wait.until(ExpectedConditions.visibilityOf(accountsFilter));
                accountsFilter.click();


            }
        }
    }
    @FindBy(xpath ="//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
   public List<WebElement> filterCriteria;
}
