Feature: Login
  User login using valid data

  Scenario: User login valid
    Given On page login
    When User enter field password
    When User enter  field username
    When User click button login
    Then Navigate to dashboard