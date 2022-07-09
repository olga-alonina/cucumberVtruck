Feature:Etsy Title Verification
  user story: as a user i should be able to verify title of page

  Background:
    Given User is on homepage
  @etsy
  Scenario: Etsy Title Verification
    Then User sees title is as expected.

  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden Spoon" is in the title
