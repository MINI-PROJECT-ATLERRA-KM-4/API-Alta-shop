Feature: homepage in vercellapp

  @homepage
  Scenario: user open altavercellapp
    Given user inside homepage altashop
    And user want to check "detail" produk
    And user choose product detail
    Then product detail is preview

  Scenario: user search category
    Given text bar search category
    And user can search category menu example "Sony PS5"
    Then user find the category

  Scenario: user choose product
    Given user select "beli" product
    And user navigate to "beli" product
    And user click button "beli" product
    Then user inside "beli" product tab

  Scenario: user choose "beli" product
    Given user navigate to "beli" product
    And user click button "cart"
    Then user product inside "cart" page

    Scenario: user choose transaction history
      Given user check transaction history
      And user want to check transaction history
      And user click button "transaksi"
      Then user inside product transaction




