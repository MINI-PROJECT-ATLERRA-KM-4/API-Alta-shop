Feature: Login in vercellapp

  @login @createaccount @normalnegative
  Scenario: Login page
    Given user in login page
    When dont have user account
    And user create user account
    Then user have user account

  @Login @registeraccount @normalpositve
  Scenario: user register account
    When user does not have account
    Then user register
    Given fill form name
    Then user fill the name form
    Given fill form email
    Then user fill the emial form
    Given fill form password
    Then user fill form password
    When user press register
    Then user account created

  @login @Loginaccount @normalpositive
  Scenario: user created account
    Given user account
    And user click button login altahsop
    And user input correct username muhnurfz@gmai.com and password 12345678
    Then user submit login
    Then user inside homepage altashop
    And user click button user altashop
    And user click button logout altashop
    Then user will be logout on altahsop







