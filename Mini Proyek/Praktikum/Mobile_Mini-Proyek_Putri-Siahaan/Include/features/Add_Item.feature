Feature: Add New Item

  @AddItem
  Scenario: Verify success add new item with valid Name, valid quantity, and choose types of food variations
    Given User is on the Groceries page
    When User click icon plus to add a groceries
    And User input valid name of the item
    And User input valid the quantity of the item
    And User click category option
    And User choose a types of food category
    And User click Add Item button
    Then verify success to add a new item and back to Groceries page to display new item

  Scenario: Verify failed add new item because did not input name of item
    Given User is on the Groceries page
    When User click icon plus to add a groceries
    And User did not input name of the item
    And User input valid the quantity of the item
    And User click category option
    And User choose a types of food category
    And User click Add Item button
    Then verify failed to add a new item and display error message

Scenario: Verify failed add new item because did not input quantity
    Given User is on the Groceries page
    When User click icon plus to add a groceries
    And User input valid name of the item
    And User did not input quantity of the item
    And User click category option
    And User choose a types of food category
    And User click Add Item button
    Then verify failed to add a new item and display error message

Scenario: Verify failed add new item because invalid name where the name is 1 character
    Given User is on the Groceries page
    When User click icon plus to add a groceries
    And User input invalid name of the item
    And User input valid the quantity of the item
    And User click category option
    And User choose a types of food category
    And User click Add Item button
    Then verify failed to add a new item and display error message

Scenario: Verify failed add new item because invalid quantity
    Given User is on the Groceries page
    When User click icon plus to add a groceries
    And User input valid name of the item
    And User input invalid quantity of the item
    And User click category option
    And User choose a types of food category
    And User click Add Item button
    Then verify failed to add a new item and display error message
    
    
    
Scenario: verification succes to resets the new item input form
    Given User is on the Groceries page
    When User click icon plus to add a groceries
    And User input valid name of the item
    And User input valid the quantity of the item
    And User click category option
    And User choose a types of food category
    And User click Reset button
    Then verify success to reset form
















    
    
    
    
    
    
    

