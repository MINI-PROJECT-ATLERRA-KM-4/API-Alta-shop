Feature: buy in vercellapp

  @buy
  Scenario: user inside product cart
    Given user can see all product category
    Then user can "bayar" product

  @buy
  Scenario: user buy more than 1 product
    Given user in homepage
    And user choose "beli" product button
    And reccuring procces more than 1 product
    And user choose "cart" button
    Then user can see all product inside cart

  @buy
  Scenario: user pay all prodcut
    Given user ada di homepage
    And user choose cart button
    And user choose "bayar" button
    Then transaction history inside cart

  @buy
  Scenario: user navigate back to homepage
    Given user inside cart page
    And user press previous page
    Then user is on altavercell app homepage

  @buy @normalnegative
  Scenario: user pay more than 1 product in cartpage
    Given inside cart page
    And user press cart page after navigate back to transaction page
    Then user paid two times in the same product

  @buy
  Scenario: user want to see all history product
    Given inside transaction page
    And user choose row per page 5 to 15
    Then user can see all product transaction


