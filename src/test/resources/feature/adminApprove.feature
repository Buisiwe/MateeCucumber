Feature: Admin approves new user account

  Scenario Outline: Admin approves and updates a new user account
    Given the admin is logged in
    And the admin is on the admin panel
    When the admin clicks on the "Approval" button
    And the admin searches for the email "<email>" in the search field
    And the admin clicks on the "Approve" button
    Then the new user account should be successfully approved

    When the admin navigates to the "Users" section on the admin panel
    And the admin searches for the same email "<email>" in the search field
    And the admin changes the user role to "Admin"
    Then the user role should be updated successfully

    When the admin clicks on the "Back to Website" button
    Then the admin should be redirected to the landing page and log out

    Examples:
      | email             |
      | jmat1@gmail.com   |