package com.fleet.pages;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US10_calendarDescription_page_AH {


   //1.

    public void LoginUser (){
        PageFactory.initElements(Driver.getDriver(), this);


    }


    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement SaveAndCloseButton;

    @FindBy(xpath = "//input[@id='oro_calendar_event_form_title-uid-67bc00b9be5f9']")
    public WebElement TitleBox;

    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement DescriptionBox;




    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventBtn;

    @FindBy(tagName = "p")
    public WebElement VerifyDescription;



    public void VerifyDescriptionBox(){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

        WebElement VerifyDescrp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("p")));

        String verifyDescription = VerifyDescrp.getText();

        System.out.println("the users description field is: " + verifyDescription);

    }




    public void CreateEventBtnClick (){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

        WebElement createCalendarEventBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Create Calendar event']")));

        createCalendarEventBtn.click();

    }

    public void setTitleBox (){

        BrowserUtils.sleep(5);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

        WebElement titleBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-ftid='oro_calendar_event_form_title']")));

        if (titleBox != null) {
            titleBox.sendKeys("New Students");
        } else {
            System.out.println("The element 'titleBox' is not found!");
        }

    }

    public void setDescriptionBox (){

        BrowserUtils.sleep(5);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

        Driver.getDriver().switchTo().frame(0);

        WebElement iframeDescriptionBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tinymce")));

        iframeDescriptionBox.clear();

        iframeDescriptionBox.sendKeys("New Cydeo Students");



        Driver.getDriver().switchTo().defaultContent();


    }

    public void SaveAndCloseButtonClick (){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        WebElement SaveAndCloseBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save and Close']")));

        SaveAndCloseBtn.click();

        BrowserUtils.sleep(10);



    }


    public void navigateToModule(String tab, String module) {

        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";

        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);

            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));

            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)), 5);
        }
    }



}
