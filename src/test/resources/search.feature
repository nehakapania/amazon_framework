@Search
Feature: Search Function

  AS an end user
  I WANT TO search a product
  SO THAT i can get respective product

  @Smoke
  Scenario:Search for a product
    Given I am on Homepage
    When  I search for a product "watch"
    Then  I should see respective products
