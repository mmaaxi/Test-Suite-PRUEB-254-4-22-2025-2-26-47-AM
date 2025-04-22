Feature: User Account Deletion

  Scenario: User requests deletion of their account
    Given the user is logged into their account
    When the user navigates to the profile settings
    And requests to delete their account
    Then the system should delete the user's account
    And confirm the deletion to the user