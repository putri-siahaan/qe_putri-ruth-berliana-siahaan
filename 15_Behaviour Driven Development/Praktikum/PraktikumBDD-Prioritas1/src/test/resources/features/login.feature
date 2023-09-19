Feature: Login

  As a user
  I want to login
  so that i can access my homepage

  Scenario: Success login
    Given i go to Login page
    When i input valid email and valid password
    And i click login button
    Then i am on the homepage of LinkedIn

  Scenario: Failed to login because input invalid email but valid password
    Given i go to Login page
    When i input invalid email and valid password
    And i click login button
    Then i didn't make it to the to homepage and get error message in the email

  Scenario: Failed to login because input valid email but invalid password
    Given i go to Login page
    When i input valid email and invalid password
    And i click login button
    Then i didn't make it to the to homepage and get error message in the password

  Scenario: Failed to login because input invalid email and invalid password
    Given i go to Login page
    When i input invalid email and invalid password
    And i click login button
    Then i didn't make it to the to homepage and get error message in the email and password

  Scenario: Failed to login because null email
    Given i go to Login page
    When i did not input email but input valid password
    And i click login button
    Then i didn't make it to the to homepage and get error message because did not input email

  Scenario: Failed login because null password
    Given i go to Login page
    When i input valid email but did not input password
    And i click login button
    Then i didn't make it to the to homepage and get error message because did not input password

  Scenario: Failed login because null email and password
    Given i go to Login page
    When i did not input email and password
    And i click login button
    Then i didn't make it to the to homepage and get error message because did not input email and password
