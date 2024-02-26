@regressivo
Feature: Breeds list retrieval

  Scenario Outline: Retrieve breeds with different limits
    Given I set the breeds list endpoint
    When I request the list of breeds with limit "<limit>"
    Then I should receive "<response>" with status code "<status>"

    Examples:
      | limit | response       | status |
      | 5     | 5 breeds       | 200    |
      | 10    | 10 breeds      | 200    |
      | 00     | error response | 500    |
      | -1    | error response | 404    |
