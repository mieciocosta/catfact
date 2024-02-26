package stepDefinitions;

import Api.FactApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static org.junit.Assert.assertTrue;

public class FactSteps {

    private Response response;

    @Given("the facts endpoint is available")
    public void theFactsEndpointIsAvailable() {
        // Implemente a definição do endpoint aqui, se necessário
    }

    @When("I request a fact with a maximum length of {int}")
    public void iRequestAFactWithAMaximumLengthOf(int maxLength) {
        response = FactApi.getFactWithMaxLength(maxLength);
    }

    @Then("^I should receive a detailed fact with \"([^\"]*)\" and status code (\\d+)$")
    public void iShouldReceiveAFactWithAndStatusCode(String expectedResult, int statusCode) {
        response.then().statusCode(statusCode);
        if (expectedResult.equals("valid")) {
            assertTrue(response.getBody().asString().contains("fact"));
        } else {
            assertTrue(response.getBody().asString().contains("error"));
        }
    }
}
