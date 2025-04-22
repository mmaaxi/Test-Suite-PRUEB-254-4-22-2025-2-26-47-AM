Feature: Password Recovery

  Scenario: User initiates password recovery process
    Given the user is on the login page
    When the user clicks on 'Forgot Password'
    And the user enters their registered email
    And the user submits the password recovery form
    Then a recovery link is sent to the registered email address