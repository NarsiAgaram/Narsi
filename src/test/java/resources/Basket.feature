Feature: Search
  As a end user
  I search for a product
  So I should be able to see the results

  Scenario: Add a product to Basket
    Given I navigate to homepage
    When I search for a item "gloves"
    And I will select a product
    And I will add product to basket
    And I will view the basket
    Then I should be able to see the product added to basket

  Scenario: Remove a product from basket
    Given I navigate to homepage
    When I search for a item "gloves"
    And I will select a product
    And I will add product to basket
    And I will view the basket
    And I remove the product from basket
    Then I should see product is removed from basket