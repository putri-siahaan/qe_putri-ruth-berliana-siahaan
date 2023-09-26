@About
Feature: About

  As a user
  I want to access "About" menu
  so that i can learn more about the SauceLabs

  @CasePositive
  Scenario: Success to the About page [Positive]
    Given I am on the homepage Saucedemo with username "standard_user" and password "secret_sauce"
    When I click on the side navbar button
    And I select the About menu from the side navbar
    Then I click cookie Notice and I see Website and mobile testing as success sign text on the about page

  @CaseNegative
  Scenario: Page was not found [Negative]
    Given I am on the homepage with username "problem_user" and password "secret_sauce"
    When I click on the side navbar button
    And I select the About menu from the side navbar
    Then I click cookie Notice and I see lost page as failed sign text on the about page


