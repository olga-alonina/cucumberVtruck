Feature:SmartBear order process
  user story:SmartBear order process

  Background:
    Given User enter login and password and click login
    Then User is logged into SmartBear Tester account
    And  go on Order page

  Scenario:User fills out the form as followed:
    When User selects "FamilyAlbum" from product dropdown
    And User enters "4" to quantity
    And User enters "John Wick" to customer name
    And User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    And User enters "IL" to state
    And User enters "60056" as zipcode
    And User selects "Visa" as card type
    And User enters "1111222233334444" to card number
    And  User enters "12/22" to expiration date
    And  User clicks process button
    Then User verifies "John Wick" is in the list