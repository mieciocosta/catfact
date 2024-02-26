package stepDefinitions;

import Api.MaxLengthFactsApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static org.junit.Assert.assertTrue;

public class MaxLengthFactsSteps {
    private Response response;

    @Given("the facts list is available")
    public void the_facts_list_is_available() {
        // Implemente a definição do endpoint aqui, se necessário
    }

    @When("I request a fact with a max length of {int}")
    public void i_request_a_fact_with_a_max_length_of(Integer maxLength) {
        response = MaxLengthFactsApi.getFactWithMaxLength(maxLength);
    }

    @Then("I should receive a fact with a length of {string} and status code {int}")
    public void i_should_receive_a_fact_with_a_length_of_and_status_code(String expectedLength, int statusCode) {
        response.then().statusCode(statusCode);
        if ("valid".equals(expectedLength)) {
            assertTrue(response.getBody().asString().contains("fact"));
        } else {
            assertTrue(response.getBody().asString().contains("error"));
        }
    }
}
