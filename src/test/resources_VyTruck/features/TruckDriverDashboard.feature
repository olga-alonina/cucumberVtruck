Feature:Checking placement buttons reset and greed settings
  user story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons

  @Smoke
  Scenario: Grid Settings should be on the right side of the Reset button

    Given Truck driver on Dashboard page
    When Truck driver hover over Fleet module
    And click on Vehicle from drop down menu
    Then Truck driver should navigate to Car_ESCES_page

