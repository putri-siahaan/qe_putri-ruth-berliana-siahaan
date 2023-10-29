Feature: Delete Item of the Groceries

  @tag1
  Scenario: Verification succes to delete the item
    Given User on the Groceries page
    When User swipes an item left or right
    Then verify success delete the item
