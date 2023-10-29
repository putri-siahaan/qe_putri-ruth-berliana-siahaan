Feature: Logout from AltaShop Account

  As an user
  I want to logout from AltaShop
  So that i am on the login page

  @TC_Logout_1
  Scenario: Verify success Logout from AltaShop Account (Positive)
    Given I am on the home page Altashop with an account that has been success logged in
    When I click user icon
    And I click logout in the option of user icon
    Then validate success to "Login" page