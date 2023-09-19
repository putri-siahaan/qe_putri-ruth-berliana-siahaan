Feature: Login

  As a user
  I want to login
  so that i can access the Sepulsa feature

  Scenario: Success login
    Given i am on the Login page Sepulsa
    When i input valid email and valid password
    And i click login button
    Then i am on the homepage of Sepulsa

  Scenario: Failed to login because input invalid email but valid password
    Given i am on the Login page Sepulsa
    When i input invalid email and valid password
    And i click login button
    Then i am failed go to homepage and get error message because invalid email

  Scenario: Failed to login because input valid email but invalid password
    Given i am on the Login page Sepulsa
    When i input valid email and invalid password
    And i click login button
    Then i am failed go to homepage and get error message because invalid password

  Scenario: Failed to login because input invalid email and invalid password
    Given i am on the Login page Sepulsa
    When i input invalid email and invalid password
    And i click login button
    Then i am failed go to homepage and get error message because invalid email and password

  Scenario: Failed to login because null email
    Given i am on the Login page Sepulsa
    When i did not input email but input valid password
    And I can't click the login button
    Then I'm still on the login page and can't get to the main page because null email

  Scenario: Failed login because null password
    Given i am on the Login page Sepulsa
    When i input valid email but did not input password
    And I can't click the login button
    Then I'm still on the login page and can't get to the main page because null password

  Scenario: Failed login because null email and password
    Given i am on the Login page Sepulsa
    When i did not input email and password
    And I can't click the login button
    Then I'm still on the login page and can't get to the main page because null email and password




