 
   Feature: Login Functionality

  Scenario Outline: Valid Login Test
    Given The user is on the login page
    When The user enters a valid username "<username>"
    And The user enters a valid password "<password>"
    And The user clicks the login button
    Then The user should be redirected to the dashboard

    Examples:
      | username        | password      |
      | standard_user  | secret_sauce |
      | problem_user   | secret_sauce |
      | performance_glitch_user | secret_sauce |
