package com.sauce.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeToWaitInSec);
        //WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(20));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
