@regressivo
Feature: Retrieve facts with specific max lengths

  Scenario Outline: Retrieve a fact with a maximum length constraint
    Given the facts list is available
    When I request a fact with a max length of <max_length>
    Then I should receive a fact with a length of "valid" and status code <status_code>

    Examples:
      | max_length | status_code |
      | 100        | 200         |
      | 140        | 200         |
      | 200        | 200         |
