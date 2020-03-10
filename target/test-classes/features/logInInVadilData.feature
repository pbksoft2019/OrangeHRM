Feature: user should not be able to log in with invalid credentials or empty field

  Background:
    Given user is on home page

  @login
  Scenario Outline: user should not be able to log in with invalid credentials

    When user enters username as"<Username>" and password as "<Password>"
    And user clicks on Login
    Then user should see "<ErrorMessage>"
    Examples:
      | Username | Password  | ErrorMessage             |
      | Admin    | admin1234 | Invalid credentials      |
      | admin    | admin1234 | Invalid credentials      |
      | Admin    | Admin1234 | Invalid credentials      |
      | admin    | Admin123  | Invalid credentials      |
      |          | admin123  | Username cannot be empty |
      | Admin    |           | Password cannot be empty |
      |          |           | Username cannot be empty |
      |          | Admin123  | Username cannot be empty |
      | admin    |           | Password cannot be empty |