package com.fleet.pages;

import com.fleet.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class vytrackLoginPage {

    public vytrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[@id='main-menu']/ul/li")
    public List<WebElement> allModules;


    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}




