package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(css = "#user-name")
    public WebElement userNameInputBox;
    @FindBy(css = "#password")
    public WebElement passwordInputBox;
    @FindBy(id = "login-button")
    public WebElement loginButton;
    public void login(String userName,String password){
        userNameInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }
}
