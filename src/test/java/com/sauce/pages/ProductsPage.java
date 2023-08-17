package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends BasePage{
    public static double totalPrice=0.0;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement sortSelect;
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public WebElement basketIn;


    public void sortItems(String orderType){
        Select select=new Select(sortSelect);
        select.selectByVisibleText(orderType);
        select.getFirstSelectedOption().click();
    }

public void adToBasket(String productName){
    Driver.get().findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class='inventory_item_description']//button")).click();
    addedItemNumber++;
}
}
