Feature: DELETE By ID

  As a user
  I want to Delete post data by ID
  so that i can delete data in ID=1

  Scenario: DELETE By Valid ID - I can Delete a post by ID (Positive)
    Given I set DELETE endpoints with ID=1
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200

  Scenario: DELETE By Invalid ID - I can't Delete a post data because using ID=101
    Given I set DELETE endpoints with ID=101
    When I send HTTP request DELETE for negative case
    Then I receive response status code is 404
    And I should see that the response contains an error message
