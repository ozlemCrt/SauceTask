package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends BasePage{
    @FindBy(xpath= "//button[text()='Checkout']")
    public WebElement checkOutButton;
    public void productIsDisplay(String productName){
        WebElement pruduct= Driver.get().findElement(By.xpath("//div[text()='"+productName+"']"));
        Assert.assertTrue(pruduct.isDisplayed());

    }
    public void productDelete(String productName){
        Driver.get().findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class='cart_item_label']//button")).click();
        addedItemNumber--;
    }
}
