Feature: Filling basic form, As a user I want to fill the web automation basic form to be able to submit the form successfully

  Scenario Outline: filling the Web Automation Basic Form
    Given the user is on the learning menu page
    When user navigates to the Web Automation Basic Form page
    And the user enters full name <full name>
    And the user enters email <email>
    And the user select incremental age <incremental age>
    And the user select gender from dropdown <gender>
    And the user select country from dropdown <country>
    And the user select experience level from dropdown <experience level>
    And the user selects the programming language <programming language>
    And the user add comments <comments>
    And the user check the terms and conditions checkbox or subscribe to the newsletter
    And the user click the submit form button or reset the form button or validate the form button
    Then the form is successfully submitted

    Examples:
      | full name  | email          | incremental age | gender | country | experience level | programming language | comments                                                       |
      | Busi Matee | busi@gmail.com | 25              | Female | Canada  | Intermediate     | Selenium             | I am interested in learning more about web automation testing. |
