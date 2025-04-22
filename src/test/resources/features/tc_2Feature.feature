Feature: Logout Functionality

  Scenario: Successful Logout
    Given The user is logged in
    When The user clicks on the logout button
    Then The user should be redirected to the login page