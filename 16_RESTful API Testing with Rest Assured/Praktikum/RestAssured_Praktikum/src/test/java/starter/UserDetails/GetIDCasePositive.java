package starter.UserDetails;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetIDCasePositive {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET valid endpoints by ID=1")
    public String setGetEndpoint(){

        return url + "posts/1";
    }

    @Step("I send HTTP request GET for positive case")
    public void sendGetHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setGetEndpoint());
    }

    @Step("I receive valid HTTP response code 200 OK")
    public void receiveHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive data of user with ID=1")
    public void validateDataDetailUser(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

}
