package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US10_calendarDescription_page_AH {


   //1.

    public void LoginUser (){
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//button[.='btn btn-success action-button']")
    public WebElement SaveAndCloseButton;

    @FindBy(id = "oro_calendar_event_form_title-uid-67ba8222df2d3")
    public WebElement TitleBox;

    @FindBy(id = "tinymce")
    public WebElement DescriptionBox;

    @FindBy(linkText ="/calendar/event")
    public WebElement CalendarEventLink;

    @FindBy(xpath = "//span[.='title title-level-1']")
    public WebElement ActivitiesTab;

    @FindBy(linkText = "/calendar/event/create")
    public WebElement CreateEventLink;






}
