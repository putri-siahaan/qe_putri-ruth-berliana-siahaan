@Reset
Feature: Reset
  I want to reset my form

Scenario: verification succes to resets the new item input form
    Given User is on the Groceries page
    When User click icon plus to add a groceries
    And User input valid name of the item
    And User input valid the quantity of the item
    And User click category option
    And User choose a types of food category
    And User click Reset button
    Then verify success to reset form