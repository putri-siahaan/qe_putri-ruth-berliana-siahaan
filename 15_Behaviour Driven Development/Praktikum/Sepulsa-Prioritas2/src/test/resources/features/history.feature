Feature: History Transaction

  As a user
  I want to view my transaction history
  So that t I can keep track of all my past transactions and payments.

  Scenario: Successful Transactions
    Given I am already on the login page of Sepulsa
    When I click on the "History" menu
    And I click the "Success" button
    Then I should see successful transaction history

  Scenario: Pending Transactions
    Given I am already on the login page of Sepulsa
    When I click on the "History" menu
    And I click the "Pending" button
    Then I should see pending transaction history

  Scenario: Fail Transactions
    Given I am already on the login page of Sepulsa
    When I click on the "History" menu
    And I click the "Fail" button
    Then I should see failed transaction history