Feature: Data tables task
  user story:user story: as user i should see all months in dropdowns

  @crm
  Scenario: User should be able to see all 12 months in months
    Given User is on the login page of CRM
    When User enters below credentials
      | username | helpdesk39@cybertekschool.com |
      | password | UserUser |
    Then User should see
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |