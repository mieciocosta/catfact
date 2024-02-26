# Java API Automation Project

## Installation and Configuration

### Prerequisites
- JDK 8 or higher installed
- Maven installed
- IDE (e.g., IntelliJ IDEA, Eclipse) for development

### Installation Steps
1. Clone the repository: `git clone https://github.com/mieciocosta/catfact.git`
2. Navigate to the project directory: `cd catfact`
3. Build the project: `mvn clean install`

### Configuration
No additional configuration required.

## Running Tests
To run the automated tests, execute the following command:

mvn test

## Dependencies
- Cucumber 6.10.4
- JUnit 4.13.2
- RestAssured 4.3.3

## Notes
- Tests are written in Gherkin syntax and can be found under `src/test/resources/features`.
- Step definitions are located in `src/test/java/stepDefinitions`.
- API configurations are in `src/test/java/config`.