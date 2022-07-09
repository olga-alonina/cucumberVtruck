Feature: Library app login feature
  User story:As a user i should be able to login with correct
  credentials to different accounts

  Accounts are: librarian, student, admin
  Scenario: Login a s librarian

    Given user is on the library login page
    When user input correct login and password
    And click on sign in button
    Then user should able to see Dashboard page

