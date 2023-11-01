@Back
Feature: Back
  I want to back to groceries page

Scenario: verification succes to back to groceries page
    Given User is on the Groceries page
    When User click icon plus to add a groceries
    And User clik back button to return to groceries page
    Then verify success to navigate to the shopping page