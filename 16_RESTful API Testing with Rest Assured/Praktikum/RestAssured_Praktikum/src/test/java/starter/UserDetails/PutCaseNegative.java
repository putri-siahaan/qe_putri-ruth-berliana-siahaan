package starter.UserDetails;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PutCaseNegative {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set a PUT endpoints with ID=101")
    public String setPutEndpointWIthInvalidID(){

        return url + "posts/101";
    }

    @Step("I send PUT HTTP request for negative case")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("body", "No body");
        requestBody.put("title", "Update of the data");
        requestBody.put("userId", notNullValue());

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointWIthInvalidID());
    }

    @Step("I receive valid HTTP response code 500 Internal Server Error")
    public void receivePutHttpResponseCode500(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I can't update a post data and I should see that the response contains an error message")
    public void unsuccessPutData(){
        restAssuredThat(response -> response.body("'userId'", notNullValue()));
    }
}
