Feature: Login Functionality

Scenario Outline: Login with multiple users
  Given User is on login page
  When User enters username "<username>"
  And User enters password "<password>"
  And User clicks login button
  And User should see "<result>"
  Then User should be closed the browser
  

Examples:
| username        | password       | result     |
| standard_user   | secret_sauce   | success    |
| invalid_user    | secret_sauce   | failure    |
| standard_user   | wrong_password | failure    |
|invalid_user     | wrong_password | failure    |
