Feature: add, delete,fill out
  user story:user should be able to add, delete items from cart, fill out purchase form

  @demoblaze
  Scenario Outline: add items
    Given customer is on homepage
    When click on <device> and <brand>
    When click on <device1> and <brand1>
    When click on <device2> and <brand2>
    When click on <buttonName>
    And delete <deletingName> from cart
    And click on <buttonName1>
    And fill in all web form fields
    And click on <buttonName2>
    And capture and log purchase Id and Amount
    And assert purchase amount equals expected
    And click on <buttonName3>
    And click on <buttonName>
    Then customer should be able to verify that there is no product in the cart
    Examples:
      | device    | brand          | device1    | brand1             | device2  | brand2              | buttonName | deletingName       | buttonName1   | buttonName2 | buttonName3 |
      | "Laptops" | "Sony vaio i5" | "Monitors" | "Apple monitor 24" | "Phones" | "Samsung Galaxy s6" | "Cart"     | "Apple monitor 24" | "Place order" | "Purchase"  | "Ok"        |
