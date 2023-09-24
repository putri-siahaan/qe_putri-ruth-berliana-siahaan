package starter.UserDetails;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllCasePositive {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET valid endpoints")
    public String setGetEndpoint(){

        return url + "posts";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setGetEndpoint());
    }

    @Step("I receive a valid HTTP response code 200 OK")
    public void receiveHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive all user details")
    public void validateDataDetailUser(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
}
