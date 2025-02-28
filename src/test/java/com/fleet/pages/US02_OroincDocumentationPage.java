package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US02_OroincDocumentationPage {
    WebDriver user;

    // Constructor
    public US02_OroincDocumentationPage() {
        this.user = Driver.getDriver();
        PageFactory.initElements(user, this);
    }

    // Web element locators
    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    @FindBy(xpath = "//i[contains(@class,'fa-question-circle')]")
    public WebElement questionMarkIcon;

    // Login method
    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}