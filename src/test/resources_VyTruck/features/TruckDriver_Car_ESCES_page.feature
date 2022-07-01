Feature:Checking placement buttons reset and greed settings
  user story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons

  @Smoke
  Scenario: Grid Settings should be on the right side of the Reset button

    Given Truck driver on Car_ESCES_page
    When navigate to reset button
    Then Grid Settings should be on the right side of the Reset button