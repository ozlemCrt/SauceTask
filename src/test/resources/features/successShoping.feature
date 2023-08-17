@wip
Feature: Success Shopping Feature

  Background:
    Given The user is on the login page
    When The user type in valid credentials: "standard_user" and "secret_sauce"
    Then The user should be able to see page title :"Products"

  Scenario: Positive Success Shopping E2E Test
    When The user should be able to sort items order type: "Price (high to low)"
    And The user should be able to add items to card with item number :"Sauce Labs Backpack"
    And The user should be able to add items to card with item number :"Sauce Labs Bike Light"
    Then The number on the basket icon should show the added item number
    When The user navigate to your cart page
    Then The user should be able to see page title: "Your Cart"
    And The user should see the items on the page that added before
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |
    When The user should be able to delete items from cart with item name :"Sauce Labs Bike Light"
    When The user should be able to delete items from cart with item name :"Sauce Labs Backpack"
    Then  The number on the basket icon should show the added item number
    When The user navigate to checkout page
  And The user should be able to see page title: "Checkout: Your Information"
 And  The user should be able to fill form with: "Cemre", "Aydın" and "123654"
    And The user click the Continue button
    Then The user should be able to see page title: "Checkout: Overview"
  When The user should be able to verify total price and number of items
    And  The user navigate to page with related button: "Finish"
    Then The user should be able to see page title: "Checkout: Complete!"
    And The user should take success shopping message: "Thank you for your order!"
