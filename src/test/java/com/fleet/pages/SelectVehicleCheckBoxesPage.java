package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectVehicleCheckBoxesPage {

    public static void selectCheckBox(int index){
        WebElement checkBox = Driver.getDriver().findElement(By.xpath("(//tbody//input[@type='checkbox'])[" + index + "]"));
        checkBox.click();
        System.out.println("checkbox"+ index + "is selected " + checkBox.isSelected());

    }
}
