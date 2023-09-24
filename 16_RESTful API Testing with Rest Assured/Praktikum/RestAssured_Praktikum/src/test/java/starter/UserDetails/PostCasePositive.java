package starter.UserDetails;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostCasePositive {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set POST valid endpoints")
    public String setPostEndpoint(){

        return url + "posts";
    }

    @Step("I send POST HTTP request for positive case")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("body", "This is a new post with REST API");
        requestBody.put("title", "New Post");
        requestBody.put("userId", "1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostEndpoint());
    }

    @Step("I receive a valid HTTP response code 201")
    public void receiveHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I should see that the response contains the newly created post data")
    public void successPostData(){
        restAssuredThat(response -> response.body("'body'", equalTo("This is a new post with REST API")));
        restAssuredThat(response -> response.body("'title'", equalTo("New Post")));
        restAssuredThat(response -> response.body("'userId'", equalTo("1")));
    }

}
