package com.sauce.pages;

import com.sauce.utilities.BrowserUtils;
import com.sauce.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    @FindBy(id = "first-name")
   public WebElement firstNameInputBox;
    @FindBy(id ="continue")
    public WebElement continueButton;
    public void fillCheckout(String firstName,String lastName,String postalCode){

        Actions actions=new Actions(Driver.get());

        actions.click(firstNameInputBox).sendKeys(firstName+ Keys.TAB)
                .sendKeys(lastName+Keys.TAB)
                .sendKeys(postalCode).perform();
    }
}
