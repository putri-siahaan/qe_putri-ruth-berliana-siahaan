@Login
Feature: Login

  As a user
  I want to login
  so that i can see the products on homepage AltaShop

  Background:
    Given I am on the AltaShop page
    When I click menu login


  @TC_Login_1
  Scenario: Success login with valid username and password [Positive]
    And I input valid email
    And I input valid password
    And i click login button
    Then validate success login and i am on the homepage AltaShop and display bar searching product "Select category ..."


  @TC_Login_2
  Scenario: Unsuccess Login because invalid email [Negative]
    And I input invalid email
    And I input valid password
    And i click login button
    Then validate failed login and i am still on the login page and see error message "record not found"


  @TC_Login_3
  Scenario: Unsuccess Login because invalid password [Negative]
    And I input valid email
    And I input invalid password
    And i click login button
    Then validate failed login and i am still on the login page and see error message "email or password is invalid"


  @TC_Login_4
  Scenario: Unsuccess Login because invalid email and invalid password [Negative]
    And I input invalid email
    And I input invalid password
    And i click login button
    Then validate failed login and i am still on the login page and see error message "record not found"


  @TC_Login_5
  Scenario: Unsuccess Login because did not input email [Negative]
    And I input valid password
    And i click login button
    Then validate failed login and i am still on the login page and see error message "email is required"


  @TC_Login_6
  Scenario: Unsuccess Login because did not input password [Negative]
    And I input valid email
    And i click login button
    Then validate failed login and i am still on the login page and see error message "password is required"


  @TC_Login_7
  Scenario: Unsuccess Login because did not input email and password [Negative]
    And i click login button
    Then validate failed login and i am still on the login page and see error message "email is required"
