Feature: Navigation to Dashboard

  Scenario: User clicks on Dashboard link
    Given the user is on the main menu
    When the user clicks on the "Dashboard" link
    Then the dashboard is displayed with relevant information