package com.sauce.steps_defs;

import com.sauce.pages.LoginPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    LoginPage loginPage=new LoginPage();
    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("The user type in valid credentials: {string} and {string}")
    public void theUserTypeInValidCredentialsAnd(String userName, String password) {
        loginPage.login(userName, password);


    }



}
