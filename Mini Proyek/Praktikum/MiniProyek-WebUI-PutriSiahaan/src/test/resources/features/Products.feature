Feature: Product (See Detail, See Product With Category, Order Product, Transaction)

  As an user
  I want to buy the product of the Alta Shop
  So that i add product to cart and make payment transactions

  @See_Detail_Product
  @TC_Product_1
  Scenario: Verify success to view product detail when user already login (Positive)
    Given I am on the home page Altashop with an account that has been success logged in
    When I click the DETAIL button of the selected product
    Then validate success to display the detail of the product

  @Category
  @TC_Product_2
  Scenario: Verify Success to Select product with category when user already login
    Given I am on the home page Altashop with an account that has been success logged in
    When I click select category bar
    And I choose the desired category for example gaming category
    Then Validate success displayed products in the gaming category

  @TC_Product_3
  Scenario: Verify Success to clear category when user already login
    Given I am on the home page Altashop with an account that has been success logged in
    When I click select category bar
    And I choose the desired category for example gaming category
    And I click clear category
    Then Validate success to clear category

  @Add_or_Removing_Product
  @TC_Product_4
  Scenario: Verify success add the product to cart when user already login (Positive)
    Given I am on the home page Altashop with an account that has been success logged in
    When I click the BELI button of the selected product
    Then validate success to add the product in the cart

  @TC_Product_5
  Scenario: Verify success add the product to cart when user did not login (Positive)
    Given I am on the home page Altashop but i did not login
    When I click the BELI button of the selected product
    Then validate success to add the product in the cart

  @TC_Product_6
  Scenario: Verify success add the quantity product from cart menu (Positive)
    Given I am on the home page Altashop with an account that has been success logged in
    When I click the BELI button of the selected product
    And I go to Cart menu
    And I am adding product in cart page by click the positive button on the quantity of the products
    Then validate success add the product according to what the user wants to buy

  @TC_Product_7
  Scenario: Verify success to remove product from cart page (Positive)
    Given I am on the home page Altashop with an account that has been success logged in
    When I click the BELI button of the selected product
    And I go to Cart menu
    And I am remove product in the cart page by click the minus button on the quantity of the products
    Then validate success remove the product


  @Transaction
  @TC_Product_8
  Scenario: Verify Success to view Transaction when user already login (Positive)
    Given I am on the home page Altashop with an account that has been success logged in
    When I click user icon
    And I click transaction in the option of user icon
    Then Validate success on the transaction page

  @TC_Product_9
  Scenario: Verify Failed to view transaction because did not login (Negative)
    Given I am on the home page Altashop but i did not login
    When I click the BELI button of the selected product
    And I click cart icon
    And I click BAYAR button
    Then Validate failed to display transaction and "back to login page"

  @TC_Product_10
  Scenario: Verify success to pay the product we have added to cart when User already Login
    Given I am on the home page Altashop with an account that has been success logged in
    When I click the BELI button of the selected product
    And I click cart icon
    And I click BAYAR button
    Then Validate success to display the transaction

  @RatingOfProduct
  @TC_Product_11
  Scenario: Verify success to give rating to the product when User already Login (Positive)
    Given I am on the home page Altashop with an account that has been success logged in
    When I click the DETAIL button of the selected product
    And I click stars to give a rating for the product
    Then validate success to give rating of the product

  @TC_Product_12
  Scenario: Verify failed to give rating of the product because user did not login (Negative)
    Given I am on the home page Altashop but i did not login
    When I click the DETAIL button of the selected product
    And I click stars to give a rating for the product
    Then validate failed to give a rating and back to login page
