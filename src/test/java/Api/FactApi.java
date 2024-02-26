package Api;

import config.Configuration;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class FactApi {

    public static Response getFactWithMaxLength(int maxLength) {
        String baseUrl = Configuration.baseUrl;
        return given().queryParam("max_length", maxLength)
                .when().get(baseUrl + "/fact");
    }
}
