package com.sauce.steps_defs;

import com.sauce.pages.YourCartPage;
import com.sauce.utilities.BrowserUtils;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class YourCart_StepDefs {
    YourCartPage yourCartPage=new YourCartPage();
    @Then("The user should be able to see page title: {string}")
    public void theUserShouldBeAbleToSeePageTitle(String expectedPageTitle) {
       // BrowserUtils.waitForVisibility(yourCartPage.pageTitle,7);
        Assert.assertEquals(expectedPageTitle, yourCartPage.getPageTitle(expectedPageTitle));
    }

    @And("The user should see the items on the page that added before")
    public void theUserShouldSeeTheItemsOnThePageThatAddedBefore(List<String> productList) {
        yourCartPage.productIsDisplay(productList.get(0));
        yourCartPage.productIsDisplay(productList.get(1));
    }

    @When("The user should be able to delete items from cart with item name :{string}")
    public void theUserShouldBeAbleToDeleteItemsFromCartWithItemName(String productName) {
        yourCartPage.productDelete(productName);

    }

    @When("The user navigate to checkout page")
    public void theUserNavigateToCheckoutPage() {
yourCartPage.checkOutButton.click();
    }
}
