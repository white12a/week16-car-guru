Feature: Find the dealers and verify

  Background: I am on Homepage
    When I mouse hover on 'buy + sell' tab

  @Regression
  Scenario Outline: Find the dealers and verify the dealers are in the list
    When  I click on 'Find a Dealer' link
    Then  I navigate to 'Car Dealers' page
    And   I should see the dealers names "<Dealers Name>" are display on page
    Examples:
      |Dealers Name|
      | 3 Point Motors Epping   |
      | 4WDD Spec    |
#      | 5 Star Auto             |
#      | A & M Car Sales Pty Ltd |
#      | A1 MOTORS COMPANY       |
#      | ANDREA MOTOR SERVICE    |
