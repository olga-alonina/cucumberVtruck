Feature: Wikipedia Search Functionality Title Verification
  user story:Wikipedia Search Functionality Title Verification

  Background:   Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button

  @wip
  Scenario: Verification wiki title,  main_header,image_header
    Then User sees "Steve Jobs" is in the "wiki title"

