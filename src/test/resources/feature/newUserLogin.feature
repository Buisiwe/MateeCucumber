Feature: A new user account is approved and the role is updated to Admin by the admin

  Scenario Outline: A new user logins and verify that is now an admin
    Given the new user is on the login page
    When the new user enters valid email <email>
    And the new user enters valid password <password>
    And the new user click the login button
    Then the new user is successfully logged in

    Examples:
      | email           | password  |
      | jmat1@gmail.com | @12345678 |
