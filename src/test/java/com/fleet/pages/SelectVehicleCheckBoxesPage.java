package com.fleet.pages;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelectVehicleCheckBoxesPage {

    public static void selectCheckBox(int index) {

    //To select all
    /*
    @FindBy(xpath = "//tbody//input[@type='checkbox']")
    List<WebElement> checkBoxes;

    public SelectVehicleCheckBoxesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void selectCheckBox(int index) {
        for(WebElement checkBox : checkBoxes) {

            checkBox.click();
        }

     */


        WebElement checkBox = Driver.getDriver().findElement(By.xpath("(//tbody//input[@type='checkbox'])[" + index + "]"));
        checkBox.click();
        System.out.println("checkbox" + index + "is selected " + checkBox.isSelected());
    }








}






