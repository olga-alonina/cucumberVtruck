Feature:User should be able to login with correct credentials

  Background: Given user on the table login page

  @webTable
  Scenario: login scenario
    When Enter username "Test"
    And Enter password "Tester"
    Then user should verify that URL ended with orders

  @webTable
  Scenario: positive login scenario
    When Enter username "Test", enter password "Tester"
    Then user should verify that URL ended with orders

  @webTable @wip
  Scenario: map data table practice
    When user enter below credentials
      | username | Test   |
      | password | Tester |
