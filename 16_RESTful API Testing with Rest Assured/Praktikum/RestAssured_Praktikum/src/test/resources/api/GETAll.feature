Feature: GET all post data

  As a user
  I want to Get all post data
  so that i can view a list of all user details

  Scenario: GET - I can get all user details with using a valid endpoint
    Given I set GET valid endpoints
    When I send GET HTTP request for positive case
    Then I receive a valid HTTP response code 200 OK
    And I receive all user details

  Scenario: GET - I can't get all user details because using a invalid endpoint
    Given I set GET invalid endpoints
    When I send GET HTTP request for negative case
    Then I receive the response status code is 404 Not Found
    And I didn't receive all user details












