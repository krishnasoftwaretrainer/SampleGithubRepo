Feature: SwagLabs Signup
Scenario: Valid Login on SwagLabs
    Given The user is on the Login page
    When The user enters a username "standard_user" 
    And The user enters a password "secret_sauce"
    And The user clicks the Login button
   Then The user should see a Products Page 

   