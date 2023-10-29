@Register
Feature: User Registration

  As a user
  I want to create a new account
  so that i will have an a account

  Background:
    Given I am on the AltaShop page
    When I click menu login
    And I click register

  @Register
  @TC-Register-1
  Scenario: Verify success register AltaShop website (Positive)
    And I input valid nama_lengkap
    And I input valid email in the field
    And I input valid the password
    And i click register button to create a new account
    Then validate success register and back to menu "Login"

  @TC-Register-2
  Scenario: Verify Failed register because input email that has been registered (Negative)
    And I input valid nama_lengkap in the field
    And I input email that has been registered
    And I input valid password int the field
    And i click register button
    Then validate failed register and display error message "duplicate key value violates unique"

  @TC-Register-3
  Scenario: Verify Failed register because did not input Full Name (Negative)
    And I input the valid email in the field
    And I input valid the password
    And i click register button
    Then validate failed register and display the error message "fullname is required"

  @TC-Register-4
  Scenario: Verify Failed register because did not input email (Negative)
    And I input valid nama_lengkap
    And I input valid the password
    And i click register button
    Then validate failed register and display error message is "email is required"

  @TC-Register-5
  Scenario: Verify Failed register because did not input password (Negative)
    And I input valid nama_lengkap
    And I input the valid email in the field
    And i click register button
    Then validate failed register and display the error message is "password is required"

  @TC-Register-6
  Scenario: Verify Failed register because input invalid email(Negative)
    And I input valid nama_lengkap
    And I input invalid email in the field
    And I input valid the password
    And i click register button to create a new account
    Then validate failed register and display the error message

  @TC-Register-7
  Scenario: Verify Failed register because input Full Name with a space (Negative)
    And I input nama_lengkap with a space
    And I input valid email in the field of Register
    And I input valid the password
    And i click register button to create a new account
    Then validate failed register and display the error message

  @TC-Register-8
  Scenario: Verify Failed register because input email with a space (Negative)
    And I input valid nama_lengkap
    And I input email with a space
    And I input valid the password
    And i click register button to create a new account
    Then validate failed register and display the error message

  @TC-Register-9
  Scenario: Verify Failed register because input password with a space (Negative)
    And I input valid nama_lengkap
    And I input a valid email in the field
    And I input password with a space
    And i click register button to create a new account
    Then validate failed register and display the error message