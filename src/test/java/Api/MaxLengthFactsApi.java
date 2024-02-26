package Api;

import config.Configuration;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class MaxLengthFactsApi {

    public static Response getFactWithMaxLength(int maxLength) {
        return given().header("accept", "application/json")
                .header("X-CSRF-TOKEN", "78OwrtQCOlhWg5zICGRUUJeQQdudD55NNwczjXTU")
                .queryParam("max_length", maxLength)
                .queryParam("limit", 1)
                .when().get(Configuration.baseUrl + "/facts");
    }
}
