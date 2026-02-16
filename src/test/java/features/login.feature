Feature: User Login
  As a registered user I want to login to Ndosi landing page so i can access my learning materials.
  Scenario Outline: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid email <email>
    And the user enters valid password <password>
    And the user click the login button
    Then the user is successfully logged in

    Examples:
      | email              | password   |
      |standard_user  |secret_sauce|
