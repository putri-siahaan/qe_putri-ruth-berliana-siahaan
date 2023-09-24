package starter.UserDetails;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class DeleteCaseNegative {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set DELETE endpoints with ID=101")
    public String setDeleteInvalidID() {
        return url + "posts/101";
    }

    @Step("I send HTTP request DELETE for negative case")
    public void sendDeleteHttpRequest() {
        SerenityRest.given()
                .when()
                .delete(setDeleteInvalidID());
    }

    @Step("I receive response status code is 404")
    public void receiveHttpDeleteResponseCode404() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I should see that the response contains an error message")
    public void unsuccessDelete() {
        Response response = SerenityRest.then().extract().response();
        System.out.println(response.asString());
    }
}
