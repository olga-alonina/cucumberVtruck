Feature:Checking placement buttons reset and greed settings
  user story: As a user when I am on Vytrack => Fleet => Vehicles,   I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons

  @vytrackWip
  Scenario: Grid Settings should be on the right side of the Reset button
    Given User on the home page
    When I hover over to "Fleet" module
    And I click "Vehicles" option
    Then I should see "Cars" page title
    Then "Reset" button on the right side of "Grid Settings"
