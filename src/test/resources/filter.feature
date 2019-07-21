@Filter
Feature: Filter Function

  AS an end user
  I WANT TO filter a product
  SO THAT i can get respective product

  @Smoke
  Scenario:Filter a product
    Given I am on Homepage
    When  I search for a product "watch"
    And   I select a filter "Men"
    Then  I should see respective brand products
