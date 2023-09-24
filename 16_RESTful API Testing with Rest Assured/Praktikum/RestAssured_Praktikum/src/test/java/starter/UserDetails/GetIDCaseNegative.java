package starter.UserDetails;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetIDCaseNegative {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET endpoints with ID=101")
    public String setGetInvalidID(){
        return url + "post/101";
    }

    @Step("I send HTTP request GET for negative case")
    public void sendGetHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setGetInvalidID())
                .getBody()
                .asString();
    }

    @Step("I receive response status code is 404 Not Found")
    public void receiveHttpResponseCode404(){

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I didn't receive user details from ID=101")
    public void didNotReceiveUserDetails(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

}
