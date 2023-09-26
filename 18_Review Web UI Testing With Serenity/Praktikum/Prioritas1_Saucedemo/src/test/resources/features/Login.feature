@Login
Feature: Login

  As a user
  I want to login
  so that i can see the products on homepage Saucedemo

  @Normal-User
  Scenario Outline: Success login with valid username and password [Positive]
    Given I am on the Login page Swag Labs
    When I input valid "<username>"
    And I input valid password
    And i click login button
    Then i am on homepage saucedemo and see various Products
    Examples:
    | username     |
    | standard_user|
    | problem_user |

    @LockedOut-User
  Scenario: Unsuccess Login because the account is locked out [Negative]
    Given I am on the Login page Swag Labs
    When I input locked username
    And I input valid password
    And i click login button
    Then i am still on the login page and see error message "Epic sadface: Sorry, this user has been locked out."
