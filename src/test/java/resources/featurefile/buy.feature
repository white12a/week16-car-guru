Feature: Search Functionality

  Background: I am on homepage
    When  I mouse hover on 'buy + sell' tab


  @smoke
  Scenario Outline: Search the buy car with model
    When  I click ‘Search Cars’ link
    Then  I navigate to ‘new and used car search’ page
    And I select make "<MAKE>"
    And I select model "<MODEL>"
    And I select location "<LOCATION>"
    And I select price "<PRICE>"
    And   I click on 'Find My Next Car' tab
    Then  I should see the make "<MAKE>" in results
    Examples:
      | MAKE       | MODEL              | LOCATION        | PRICE   |
      | Audi       | A1                 | NSW - Sydney    | $50,000 |
      | Honda      | Civic              | NSW - All       | $20,000 |
      | Ford       | Fiesta             | SA - Adelaide   | $15,000 |
      | Nissan     | Qashqai            | VIC - Melbourne | $40,000 |
      | Jaguar     | F-Pace             | ACT - All       | $80,000 |
      | Land Rover | Range Rover Evoque | QLD - Brisbane  | $40,000 |


  @sanity
  Scenario Outline: Search the used car with model
    When  I click ‘Used’ link
    Then  I navigate to ‘Used Cars For Sale’ page
    And I select make "<MAKE>"
    And I select model "<MODEL>"
    And I select location "<LOCATION>"
    And I select price "<PRICE>"
    And   I click on 'Find My Next Car' tab
    Then  I should see the make "<MAKE>" in results
    Examples:
      | MAKE       | MODEL              | LOCATION          | PRICE   |
      | Ford       | Focus              | NSW - New England | $50,000 |
      | BMW        | 4 Series           | NSW - Hunter      | $80,000 |
      | Volkswagen | Polo               | SA - North        | $35,000 |
      | Nissan     | Qashqai            | VIC - Melbourne   | $40,000 |
      | Jaguar     | F-Pace             | WA - Perth        | $100,000 |
      | Land Rover | Range Rover Evoque | QLD - Brisbane    | $70,000 |



