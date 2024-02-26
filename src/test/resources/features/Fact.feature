@regressivo
Feature: Cat Fact with different max lengths

  Scenario Outline: Retrieve facts with different max lengths
    Given the facts endpoint is available
    When I request a fact with a maximum length of <maxLength>
    Then I should receive a detailed fact with "<expectedResult>" and status code <statusCode>

    Examples:
      | maxLength | expectedResult | statusCode |
      | 100       | valid          | 200        |
      | 140       | valid          | 200        |
