@TestCheckout
Feature: Checkout

  As a user
  I want to proceed to checkout
  so that i can complete my purchase and receive my ordered items in a timely manner

  @PositiveCase
  Scenario: Successful Checkout Process [Positive]
    Given I am on the homepage Saucedemo with username "standard_user" and password "secret_sauce"
    When I see the Products text on the inventory page
    And I add the Sauce Labs Bike Light items to my cart
    And I click on the cart button
    And I proceed to checkout
    And I fill in the first name as "Putri"
    And I fill in the last name as "Siahaan"
    And I enter the postal code as "22314"
    And I click continue to the next step
    And I click finish button
    Then I see the "Checkout: Complete!" text as confirmation of the successful checkout

  @NegativeCase
  Scenario: Unsuccessful Checkout because do not fill the required data [Negative]
    Given I am on the homepage Saucedemo with username "standard_user" and password "secret_sauce"
    When I see the Products text on the inventory page
    And I add the Sauce Labs Bike Light items to my cart
    And I click on the cart button
    And I proceed to checkout
    And I click continue to the next step
    Then I notice an error message stating "Error: First Name is required" as an indication of checkout failure.

