Feature:SmartBear order process
  user story: as a user i should be able to fill out all steps

  @smartBear_outline
  Scenario Outline: As a user I should see myself on the list after placing an order
    Given user is logged into SmartBear Tester account and on Order page
      | username | Tester |
      | password | test   |
    When  user selects "<product>" from product dropdown
    Then user enters <quantity> to quantity
    And user enters "<customer name>" to costumer name
    Then user enters "<street>" to street
    And user enters "<city>" to city
    Then user enters "<state>" to state
    And user enters <zip>
    Then user selects "<cardType>" as card type
    And user enters "<card number>" to card number
    Then user enters "<expiration date>" to expiration date
    When user clicks process button
    Then user verifies "<expected name>" is in the list
    Examples:
      | product     | quantity | customer name   | street      | city        | state | zip   | cardType | card number  | expiration date | expected name   |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | IL    | 60004 | Visa     | 313313133315 | 12/22           | Ken Adams       |
      | FamilyAlbum | 4        | Joey Tribbiani  | State st    | Chicago     | IL    | 60656 | Visa     | 123433533336 | 11/22           | Joey Tribbiani  |
      | ScreenSaver | 5        | Rachel Green    | Michigan st | Chicago     | IL    | 60056 | Visa     | 335333333337 | 10/22           | Rachel Green    |
      | MyMoney     | 5        | Chandler Bing   | Erie st     | Chicago     | IL    | 60666 | Visa     | 433353333338 | 10/22           | Chandler Bing   |
      | FamilyAlbum | 9        | Dr DrakeRamoray | Dale st     | Arl Heights | IL    | 60452 | Visa     | 532333335334 | 10/22           | Dr DrakeRamoray |
      | ScreenSaver | 10       | Monica Geller   | Euclid ave  | Arl Heights | IL    | 60312 | Visa     | 733533333333 | 10/22           | Monica Geller   |
      | MyMoney     | 3        | Ross Geller     | River rd    | Des Plaines | IL    | 60666 | Visa     | 833435363732 | 10/22           | Ross Geller     |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | IL    | 60312 | Visa     | 933533333531 | 12/22           | Ken Adams       |
