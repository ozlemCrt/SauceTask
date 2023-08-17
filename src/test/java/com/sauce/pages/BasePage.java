package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    public static int addedItemNumber=0;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement basketIn;

    public int getAddedItemNumber(){
        String addedItem=basketIn.getText();
        if(addedItem.isEmpty()) return 0;
        return Integer.parseInt(addedItem);


    }

    public String getPageTitle(String pagName){
      return  Driver.get().findElement(By.xpath("//span[text()='"+pagName+"']")).getText();
    }
}
