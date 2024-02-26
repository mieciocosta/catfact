# Cat Facts API - Test Scenarios

## Breeds

### Get a list of breeds

#### Scenario: Verify if it's possible to get a list of breeds
- **Given** that I have access to the Cat Facts API
- **When** I request the list of breeds
- **Then** I should receive a list of available breeds
    - And the response should contain status 200

#### Scenario: Verify if it's possible to get a list of breeds with a specified limit
- **Given** that I have access to the Cat Facts API
    - And I define a limit for the list of breeds
- **When** I request the list of breeds with the specified limit
- **Then** I should receive a list of breeds with the number of items equal to the specified limit
    - And the response should contain status 200

### Alternative Scenarios

#### Scenario: Handle when there are no breeds available
- **Given** that I have access to the Cat Facts API
    - And there are no breeds available at the moment
- **When** I request a list of breeds
- **Then** I should receive a message indicating that there are no breeds available at the moment
    - And the response should contain status 404

## Facts

### Get Random Fact

#### Scenario: Verify if it's possible to get a random fact
- **Given** that I have access to the Cat Facts API
- **When** I request a random fact
- **Then** I should receive a random fact
    - And the response should contain status 200

#### Scenario: Verify if it's possible to get a fact with a specified maximum length
- **Given** that I have access to the Cat Facts API
    - And I define a maximum length for the fact
- **When** I request a fact with the specified maximum length
- **Then** I should receive a fact with a length less than or equal to the specified maximum length
    - And the response should contain status 200

### Alternative Scenarios

#### Scenario: Handle when there are no facts available
- **Given** that I have access to the Cat Facts API
    - And there are no facts available at the moment
- **When** I request a random fact
- **Then** I should receive a message indicating that no facts are available at the moment
    - And the response should contain status 404

#### Scenario: Handle when a fact with an invalid maximum length is requested
- **Given** that I have access to the Cat Facts API
    - And I define an invalid maximum length for the fact
- **When** I request a fact with the specified maximum length
- **Then** I should receive an error message indicating that the maximum length is invalid
    - And the response should contain status 400

### Get a list of facts

#### Scenario: Verify if it's possible to get a list of facts
- **Given** that I have access to the Cat Facts API
- **When** I request a list of facts
- **Then** I should receive a list of facts
    - And the response should contain status 200

#### Scenario: Verify if it's possible to get a list of facts with a specified limit
- **Given** that I have access to the Cat Facts API
    - And I define a limit for the list of facts
- **When** I request a list of facts with the specified limit
- **Then** I should receive a list of facts with the number of items equal to the specified limit
    - And the response should contain status 200

### Alternative Scenarios

#### Scenario: Handle when there are no facts available
- **Given** that I have access to the Cat Facts API
    - And there are no facts available at the moment
- **When** I request a list of facts
- **Then** I should receive a message indicating that no facts are available at the moment
    - And the response should contain status 404
