Feature: PUT By ID

  As a user
  I want to update the data detail with ID
  So that I can see the changes of the data

  Scenario: PUT - I can update a post data with valid ID (Positive)
    Given I set PUT endpoints with ID=1
    When I send PUT HTTP request for positive case
    Then I receive a valid HTTP response code 200
    And I should see that the response contains the updated post

  Scenario: PUT - I can't update a post data because using invalid ID (Negative)
    Given I set a PUT endpoints with ID=101
    When I send PUT HTTP request for negative case
    Then I receive valid HTTP response code 500 Internal Server Error
    And I can't update a post data and I should see that the response contains an error message