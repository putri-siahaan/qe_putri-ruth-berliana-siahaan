package starter.UserDetails;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostCaseNegative {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set a POST valid endpoints")
    public String setAPostEndpoint(){

        return url + "posts";
    }

    @Step("I send POST HTTP request for negative case")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("body", notNullValue());
        requestBody.put("title", notNullValue());
        requestBody.put("userId", notNullValue());

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setAPostEndpoint());
    }

    @Step("I receive a valid HTTP response code 500 Internal Server Error")
    public void receiveHttpResponseCode500(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I don't receive a new user data")
    public void unsuccessPostData(){
        restAssuredThat(response -> response.body("'body'", notNullValue()));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'userId'", notNullValue()));
    }

}
