Feature: movie suggestion feature
  As a user i should be  able to get movies according to my preference

  Scenario: movie search
    Given I like "actions"
    And  I like "drama"
    And I like "cartoon"
    When i go to homepage
    Then I should get recommendation