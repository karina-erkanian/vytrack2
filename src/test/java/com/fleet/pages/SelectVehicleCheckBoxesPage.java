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

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import java.util.SortedMap;

public class SelectVehicleCheckBoxesPage {

    public static void checkUnselectedCheckBoxes(){
        WebElement checkBoxAll = Driver.getDriver().findElement(By.xpath("//table//th//input[@type='checkbox']"));
        System.out.println("checkBoxAll.isSelected() = " + checkBoxAll.isSelected());

    }

    public static void selectCheckBox(int index) {

        WebElement checkBox = Driver.getDriver().findElement(By.xpath("(//tbody//input[@type='checkbox'])[" + index + "]"));
        checkBox.click();
        System.out.println("checkbox" + index + "is selected " + checkBox.isSelected());
    }

    public static void selectAllCheckBoxes() {
        WebElement allCheckBox = Driver.getDriver().findElement(By.xpath("//table//th//input[@type='checkbox']"));
        allCheckBox.click();
        System.out.println("allCheckBox is selected " + allCheckBox.isSelected());
    }
}















