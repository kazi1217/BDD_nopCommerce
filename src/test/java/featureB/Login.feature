Feature: Login Action

  @SmokeTest
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User enters UserName and Password
    Then Message displayed Login Successfully


  Scenario: UNSuccessful Login with Valid  username and Invalid password
    Given User is on Home Page one
    When User Navigate to LogIn Page one
    And User enters UserName and Password one
    Then Message displayed Login Successfully one

  Scenario: UNSuccessful Login with InValid  username and valid password
    Given User is on Home Page two
    When User Navigate to LogIn Page two
    And User enters UserName and Password two
    Then Message displayed Login Successfully two

  Scenario: UNSuccessful Login with InValid  username and Invalid password
    Given User is on Home Page three
    When User Navigate to LogIn Page three
    And User enters UserName and Password three
    Then Message displayed Login Successfully three