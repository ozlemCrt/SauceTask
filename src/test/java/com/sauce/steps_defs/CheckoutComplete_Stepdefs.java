package com.sauce.steps_defs;

import com.sauce.pages.CheckoutCompletePage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class CheckoutComplete_Stepdefs {
    CheckoutCompletePage completePage=new CheckoutCompletePage();
    @And("The user should take success shopping message: {string}")
    public void theUserShouldTakeSuccessShoppingMessage(String message) {
        Assert.assertEquals(message,completePage.messageText.getText());
    }
}
