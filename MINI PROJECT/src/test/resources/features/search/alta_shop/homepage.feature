  Feature: homepage

    @homepage
    Scenario: user open altavercellapp
      Given user inside hompage
      And user choose product detail
      Then product detail is preview

  Scenario: user choose product
    Given user select "beli" product
    Then user choose "beli" product

  Scenario: user choose "beli" product
    Given user want to "beli" product
    Then user product inside cart

  Scenario: user search category
    Given text bar search category
    And user can search category menu
    Then user find the category

