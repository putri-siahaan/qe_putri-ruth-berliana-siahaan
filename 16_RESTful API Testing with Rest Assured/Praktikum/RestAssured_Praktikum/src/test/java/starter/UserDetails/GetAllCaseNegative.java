package starter.UserDetails;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllCaseNegative {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET invalid endpoints")
    public String setGetInvalidEndpoint(){
        return url + "post";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setGetInvalidEndpoint())
                .getBody()
                .asString();
    }

    @Step("I receive the response status code is 404 Not Found")
    public void receiveHttpResponseCode404(){

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I didn't receive all user details")
    public void didNotReceiveAllUserDetails(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
}
