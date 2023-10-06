Feature: Register

  @Register_Success
  Scenario: As a new user, I have be able to create a new account [Positive]
    Given i am on the login page
    When i click register link
    And i input name "Putri" on name field
    And i input email "ruthputri135@gmail.com" on the email field
    And i input password "keluargaku123" on the password field
    And i input confirm password "keluargaku123" in the confirm password field
    And i click register button
    Then i see message "Registration Successful"

  @Register_UnSuccess_1
  Scenario: Empty Name on the field name [Negative]
    Given i am on the login page
    When i click register link
    And i input email "ruthputri135@gmail.com" on the email field
    And i input password "keluargaku123" on the password field
    And i input confirm password "password" in the confirm password field
    And i click register button
    Then i see error message in the confirm Password field "Enter Full Name"

  @Register_UnSuccess_2
  Scenario: Wrong Confirm Password [Negative]
    Given i am on the login page
    When i click register link
    And i input name "Putri" on name field
    And i input email "ruthputri135@gmail.com" on the email field
    And i input password "keluargaku123" on the password field
    And i input confirm password "password" in the confirm password field
    And i click register button
    Then i see error message in the confirm Password field "Password Does Not Matches"

  @Register_UnSuccess_3
  Scenario: Invalid email [Negative]
    Given i am on the login page
    When i click register link
    And i input name "Putri" on name field
    And i input email "ruthputri135" on the email field
    And i input password "keluargaku123" on the password field
    And i input confirm password "password" in the confirm password field
    And i click register button
    Then i see error message in the email field "Enter Valid Email"