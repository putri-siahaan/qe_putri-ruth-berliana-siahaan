Feature: Update Profile

  As a user,
  I want to update my profile information,
  So that I can keep my personal details up to date.

  Scenario: User updates their profile successfully
    Given As a user i am already on the login page of Sepulsa
    When User clicks "Account" menu
    And User clicks on "View & change profiles"
    And User clicks on "Change Profile"
    And User inputs their name as "Putri Siahaan"
    And User inputs their phone number as "085260897523"
    And User clicks on "Update Profile"
    Then User should see a success message "Profile updated successfully"

  Scenario: User updates their profile with invalid phone number
    Given As a user i am already on the login page of Sepulsa
    When User clicks "Account" menu
    And User clicks on "View & change profiles"
    And User clicks on "Change Profile"
    And User inputs their name as "Putri Siahaan"
    And User inputs an invalid phone number "85260897523"
    And User clicks on "Update Profile"
    Then User should see an error message "Your cellphone number format is wrong. Don't forget the number 0 in front."

  Scenario: User updates their profile with invalid name
    Given As a user i am already on the login page of Sepulsa
    When User clicks "Account" menu
    And User clicks on "View & change profiles"
    And User clicks on "Change Profile"
    And User inputs an invalid name as "v"
    And User inputs their phone number as "085260897523"
    And User can't click the login button
    Then User should see an error message "The name you entered is too short. Minimum 2 letters."