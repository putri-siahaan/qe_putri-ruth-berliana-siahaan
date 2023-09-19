Feature: Search
  As a user
  I want to find a company
  so that i can get the information of the company

  Scenario: success to find the company
    Given As a user i am already on the homepage of LinkedIn and clicked the search field
    When I input the valid name of the Company and press ENTER on the keyboard
    And select the company I want to know information about
    Then I success to get the information from the company

  Scenario: Failed to find the company
    Given As a user i am already on the homepage of LinkedIn and clicked the search field
    When I input the invalid name of the Company and press ENTER on the keyboard
    And no company search results
    Then I am failed to get the information from the company

