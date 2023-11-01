Feature: Delete Item of the Groceries

  @Delete
  Scenario: Verification succes to delete the item from left to right
    Given User on the Groceries page
    When User swipes an item from left to right
    Then verify success delete the item
    
    Scenario: Verification succes to delete the item from right to left
    Given User on the Groceries page
    When User swipes an item from right to left
    Then verify success delete the item
    
    Scenario: Verification succes to delete the item from Bottom to Up
    Given User on the Groceries page
    When User swipes an item from bottom to up
    Then verify success delete the item

    Scenario: Verification succes to delete the item from Bottom to Up
    Given User on the Groceries page
    When User swipes an item from top to bottom
    Then verify success delete the item
    