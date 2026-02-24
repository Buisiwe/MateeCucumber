Feature: Admin approve new user account

  Scenario Outline: Admin approves new user account
    Given the admin is logged in
    When the admin clicks on admin panel
    When the admin clicks on the approval button
    When the admin search for the email by entering <email> in the search field
    When the admin tick a checkbox next to the email in the search result
    When the admin clicks on approve button
    When the new user account is successfully approved
    Then the admin click back to website button

    Examples:
      | email          |
      | jmat5@gmail.com |