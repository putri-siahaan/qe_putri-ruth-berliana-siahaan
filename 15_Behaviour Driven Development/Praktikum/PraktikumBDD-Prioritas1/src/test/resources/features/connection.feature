Feature: Connection

  As a user
  I want to see invitation of my network
  so that i can connect to them

  Scenario: Success connect to friend who invited me
    Given As a user i am already on the homepage of LinkedIn
    When I click My Network menu
    And I click Accept to accept the invitation
    Then I successfully connected to them

  Scenario: Failed to connect
    Given As a user i am already on the homepage of LinkedIn
    When I click My Network menu
    And I click ignore for the invitation
    Then I'm not connected to them