Feature: As an User, I want to success Login, So that I can see my home page

  @Login_Success
  Scenario: As an User, I am success login because valid email and password [Positive]
    Given user on the login page
    When user input "ruthputri135@gmail.com" on email field
    And user input "keluargaku123" on password field
    And user click login button
    Then user see success to homepage app "Success Login"

  @Login_Unsuccess
  Scenario: As an User, I cannot Login because invalid password but valid email [Negative]
    Given user on the login page
    When user input "ruthputri135@gmail.com" on email field
    And user input "password" on password field
    And user click login button
    Then user see error message "Wrong Email or Password"