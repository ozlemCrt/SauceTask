package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;

public class CheckoutOverviewPage {
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    public WebElement totalPrice;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> listOfTotalItems;
    @FindBy(xpath = "//button[text()='Finish']")
    public WebElement finishButton;
    public void goToPage( String buttonName){
        Driver.get().findElement(By.xpath("//button[text()='"+buttonName+"']")).click();
    }

    public void verifyTotalPrice(){

        String totalPriceText = totalPrice.getText().substring(13);
        //double actualTotalPrice = Double.parseDouble(totalPriceText.substring(13));

        double expectedTotalPrice=ProductsPage.totalPrice;
        DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(dfs);
        String expectedTotal= df.format(expectedTotalPrice);

        System.out.println("totalPriceText = " + totalPriceText);
        System.out.println("expectedTotalPrice = " + expectedTotal);

        if (totalPriceText.equals("0")){
            Assert.assertTrue(Double.parseDouble(totalPriceText)==0);
        }else{
            Assert.assertEquals(expectedTotal, totalPriceText);
        }
    }

    public void verifyNumberOfItems(){
        int actualNumber=listOfTotalItems.size();
        int expectedNumber=ProductsPage.addedItemNumber;
        Assert.assertEquals(expectedNumber,actualNumber);
    }
}
