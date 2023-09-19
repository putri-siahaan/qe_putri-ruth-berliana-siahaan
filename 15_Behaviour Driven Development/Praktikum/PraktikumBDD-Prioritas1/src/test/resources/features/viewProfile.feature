Feature: View Profile

  As a user
  I want to see my profile
  so that i can see my detail information

  Scenario: Success to see my profile
    Given As a user i am on the homepage of LinkedIn
    When I click button Me, which is located beside notification button
    And I click View Profile
    Then I success to see detail of my profile