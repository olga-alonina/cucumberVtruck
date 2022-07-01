Feature:  Truck driver login with valid credentials

  Background:
    Given Truck driver is on the Login page

  Scenario :Truck Driver Login with valid credentials
    When Truck driver inputs correct credentials
    Then Truck driver should navigate to DashboardPage
