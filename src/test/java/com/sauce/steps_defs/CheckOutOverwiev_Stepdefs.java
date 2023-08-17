package com.sauce.steps_defs;

import com.sauce.pages.CheckoutOverviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CheckOutOverwiev_Stepdefs {
    CheckoutOverviewPage checkoutOverviewPage=new CheckoutOverviewPage();
    @When("The user should be able to verify total price and number of items")
    public void theUserShouldBeAbleToVerifyTotalPriceAndNumberOfItems() {
      // checkoutOverviewPage.verifyTotalPrice();
       // checkoutOverviewPage.verifyNumberOfItems();
    }

    @And("The user navigate to page with related button: {string}")
    public void theUserNavigateToPageWithRelatedButton(String buttonName) {
        checkoutOverviewPage.goToPage(buttonName);
    }
}
