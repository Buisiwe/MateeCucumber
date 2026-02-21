Feature: User Sing Up, As a user I want to register on the ndosi website to be able to access the features of the website

Scenario Outline: sign up to register new user account
Given the user clicks on login button on the landing page
When the user click the sign up link
And the user enters firstName <firstName>
And the user enters lastName <lastName> and the user enters email <email> and the user enters password <password> and the user enters confirm{assword <confirmPassword>and the user select group from dropdown <group>
And the user click the sign up button
Then the user is successfully registered

Examples:
| first name | last name | email           | password  | confirm password | group                 |
| Josey      | Matee     | admin@gmail.com | @12345678 | @12345678        | 5th Group 2025 (2025) |