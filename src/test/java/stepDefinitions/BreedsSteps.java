package stepDefinitions;

import Api.BreedsApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import config.Configuration;

public class BreedsSteps {

    private Response response;

    @Given("I set the breeds list endpoint")
    public void iSetTheBreedsListEndpoint() {
    }

    @When("I request the list of breeds with limit {string}")
    public void iRequestTheListOfBreedsWithLimit(String limit) {
        response = BreedsApi.getBreedsList(limit);
    }

    @Then("I should receive {string} with status code {string}")
    public void iShouldReceiveWithStatusCode(String responseCondition, String statusCode) {
        int expectedStatusCode = Integer.parseInt(statusCode);
        response.then().statusCode(expectedStatusCode);

        if (!responseCondition.equals("error response")) {
            int expectedSize = Integer.parseInt(responseCondition.split(" ")[0]);
            if (expectedSize > 0) {
                response.then().body("data", hasSize(expectedSize));
            } else {
                response.then().body("data.size()", is(0));
            }
        }
    }
}
