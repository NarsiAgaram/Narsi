Feature: Search
  As a end user
  I want to search for a product
  So that i can view respective products

  Scenario: Search for a product
    Given I navigate to homepage
    When I search for a item "bulb"
    Then I should be able to see results

  Scenario: Search Product by filter
    Given I navigate to homepage
    When I search for a item "bulb"
    And I set filer to "CFL Bulbs"
    Then I should be able to see results are filtered
