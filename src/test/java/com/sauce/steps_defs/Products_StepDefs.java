package com.sauce.steps_defs;

import com.sauce.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Products_StepDefs {
    ProductsPage productsPage=new ProductsPage();
    @Then("The user should be able to see page title :{string}")
    public void theUserShouldBeAbleToSeePageTitle(String pageTitle) {
        String actualPageTitle =   productsPage.getPageTitle(pageTitle);
        Assert.assertEquals(pageTitle,actualPageTitle);

    }

    @When("The user should be able to sort items order type: {string}")
    public void theUserShouldBeAbleToSortItemsOrderType(String orderType) {
productsPage.sortItems(orderType);
    }

    @And("The user should be able to add items to card with item number :{string}")
    public void theUserShouldBeAbleToAddItemsToCardWithItemNumber(String itemNumber) {
        productsPage.adToBasket(itemNumber);
    }

    @Then("The number on the basket icon should show the added item number")
    public void theNumberOnTheBasketIconShouldShowTheAddedItemNumber() {
        Assert.assertEquals(productsPage.addedItemNumber,productsPage.getAddedItemNumber());
    }

    @When("The user navigate to your cart page")
    public void theUserNavigateToYourCartPage() {
        productsPage.basketIn.click();
    }
}
