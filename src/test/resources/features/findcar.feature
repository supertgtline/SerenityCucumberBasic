Feature: Finding New Cars
  As a user i want to find new cars
Background:
  Given user navigate to the website

  Scenario Outline: User finding a new car

    Given user navigate to the website
    When user choose menu as new car
    Then user click on find new cars
    |price|
    |2000 |
    |5000 |
    And user search for <brand> car

    Examples:
    | brand   |
    | Kia     |
    | Toyota  |
    | Huyndai |
    | Honda   |