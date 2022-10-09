Feature: Add to cart
  User select product to cart

  Scenario: User add to cart
    Given On page login
    When User enter  field username
    When User enter field password
    When User click button login

    When User click add to cart
    When User go to cart page
    Then see product on cart page