Feature: Post Data

  As a user
  I want to add new data
  So that I can create new data

  Scenario: POST - I can create a new user with valid data (Positive)
    Given I set POST valid endpoints
    When I send POST HTTP request for positive case
    Then I receive a valid HTTP response code 201
    And I should see that the response contains the newly created post data

  Scenario: POST - I can't create a new user because it doesn't fill in the required data (Negative)
    Given I set a POST valid endpoints
    When I send POST HTTP request for negative case
    Then I receive a valid HTTP response code 500 Internal Server Error
    And I don't receive a new user data