package com.sauce.steps_defs;

import com.sauce.pages.CheckoutPage;
import io.cucumber.java.en.And;

public class CheckOut_Stepdefs {
    CheckoutPage checkoutPage=new CheckoutPage();
    @And("The user should be able to fill form with: {string}, {string} and {string}")
    public void theUserShouldBeAbleToFillFormWithAnd(String firstname, String lastname, String postalCode) {
        checkoutPage.fillCheckout(firstname,lastname,postalCode);

    }

    @And("The user click the Continue button")
    public void theUserClickTheContinueButton() {
        checkoutPage.continueButton.click();
    }
}
