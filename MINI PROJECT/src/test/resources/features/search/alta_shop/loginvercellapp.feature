Feature: Login

  @loginvercellapp
  Scenario: Login page
    Given user in login page
    When dont have user account
    And user create user account
    Then user have user account

    Scenario: user created account
      Given user account
      When user fill the login form
      And user click login
      Then user inside home page




