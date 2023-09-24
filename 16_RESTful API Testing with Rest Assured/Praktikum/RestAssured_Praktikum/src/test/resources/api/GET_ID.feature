Feature: GET By ID

  As a user
  I want to Get post data by ID
  so that i can see the detailed a list of user

  Scenario: GET By ID - I can get a user details with using a valid id
    Given I set GET valid endpoints by ID=1
    When I send HTTP request GET for positive case
    Then I receive valid HTTP response code 200 OK
    And I receive data of user with ID=1

  Scenario: GET - I can't get user details because using ID=101 which this iD is not available
    Given I set GET endpoints with ID=101
    When I send HTTP request GET for negative case
    Then I receive response status code is 404 Not Found
    And I didn't receive user details from ID=101
