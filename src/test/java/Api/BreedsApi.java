package Api;

import config.Configuration;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class BreedsApi {

    public static Response getBreedsList(String limit) {
        return given()
                .baseUri(Configuration.baseUrl)
                .param("limit", limit)
                .when()
                .get("/breeds");
    }
}
