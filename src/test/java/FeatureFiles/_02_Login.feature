Feature: Log in Functionality

  Scenario: Login with valid username and password

    Given Navigate to Parabank
    When Enter username and password click login button
    Then User should login successfully

  Scenario Outline: Enter with invalid username and password
    Given Navigate to Parabank
    When Enter invalid "<username>" and "<password>" click login button

    Then User shouldNot login successfully
    Examples:
      | username | password |
      | Kemal    | 1122     |
      | Kamil    | 2233     |
      | Kamrul   | 3344     |
