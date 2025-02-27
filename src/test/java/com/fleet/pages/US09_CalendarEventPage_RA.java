package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class US09_CalendarEventPage_RA {

    public US09_CalendarEventPage_RA() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a")
    public WebElement createEventButton;

    @FindBy(xpath = "//input[@type='checkbox' and contains(@id, 'recurrence-repeat-view')]")
    public WebElement recurrenceCheckbox;

    @FindBy(css = ".recurrence-subview-control__number")
    public WebElement recurrenceInputField;

    @FindBy(xpath = "//span[text()='The value have not to be more than 99.']")
    public WebElement errorMessageMoreThan99;

    @FindBy(xpath = "//span[text()='The value have not to be less than 1.']")
    public WebElement errorMessageLessThan1;

    public void navigateToCalendarEventPage() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().get("https://qa2.vytrack.com/calendar/event");
    }

    public void clickCreateEventButton() {
        createEventButton.click();
    }

    public void checkRecurrenceCheckbox() {
        recurrenceCheckbox.click();
    }

    public void setRecurrenceValue(String value) {
        recurrenceInputField.clear();
        recurrenceInputField.sendKeys(value);
    }

    public boolean isErrorMessageMoreThan99Displayed() {
        return errorMessageMoreThan99.isDisplayed();
    }

    public boolean isErrorMessageLessThan1Displayed() {
        return errorMessageLessThan1.isDisplayed();
    }
}