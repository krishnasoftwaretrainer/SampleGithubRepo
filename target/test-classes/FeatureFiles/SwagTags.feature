@LoginFeature
Feature: SwagLabs Login

@Smoke @ValidLogin
Scenario: Valid Login
    Given The user is on the login page
    When The user enters username "standard_user"
    And The user enters password "secret_sauce"
    And The user clicks the Login button
    Then The user should see the Products Page

@Regression @InvalidLogin
Scenario: Invalid Login
    Given The user is on the login page
    When The user enters username "invalid_user"
    And The user enters password "secret_sauce"
    And The user clicks the Login button
    Then The user should see an error message