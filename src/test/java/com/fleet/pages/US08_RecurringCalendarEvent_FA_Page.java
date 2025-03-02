package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US08_RecurringCalendarEvent_FA_Page extends BasePage {

    public US08_RecurringCalendarEvent_FA_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//span[@class='title title-level-1'][normalize-space()='Activities']")
    public WebElement ActivitiesBtn;

    @FindBy(xpath = "//span[normalize-space()='Calendar Events']")
    public WebElement CalendarEventBtn;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement creatCalendarEventBtn;

    @FindBy(xpath = "//input[@type='checkbox' and contains(@id, 'recurrence-repeat-view')]")
    public WebElement RepeatCheckbox;

    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement RepeatEveryNumber;

    @FindBy(xpath ="//label[text()='Reminders']" )
    public WebElement RemindersText;



    @FindBy(xpath = "//select[@id='recurrence-repeats-view1365']")
    public WebElement DropDownRepeats;







    @FindBy(xpath = "(//span[contains(text(),'This value should not be blank.')])[2]")
    public WebElement errorMsg;





}
