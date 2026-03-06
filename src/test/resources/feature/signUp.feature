Feature: User Sing Up, As a user I want to register on the ndosi website to be able to access the features of the website

  Scenario Outline: sign up to register new user account
    Given the user clicks on login button on the landing page
    When the user click the sign up link
    And the user enters first name <firstName>
    And the user enters last name <lastName>
    And the user enters register email <email>
    And the user enters register password <password>
    And the user enters confirm password <confirmPassword>
    And the user selects group <group>
    And the user click the sign up button
    Then the user is successfully registered

    Examples:
      | firstName | lastName | email           | password  | confirmPassword | group                     |
      | Josey     | Matee    | jmat3@gmail.com | @12345678 | @12345678       | group 5 assignment (2026) |