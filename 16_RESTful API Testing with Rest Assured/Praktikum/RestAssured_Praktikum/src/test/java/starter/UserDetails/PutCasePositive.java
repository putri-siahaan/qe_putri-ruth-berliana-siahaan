package starter.UserDetails;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutCasePositive {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set PUT endpoints with ID=1")
    public String setPutEndpoint(){

        return url + "posts/1";
    }

    @Step("I send PUT HTTP request for positive case")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("body", "No body");
        requestBody.put("title", "Update of the data");
        requestBody.put("userId", "1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpoint());
    }

    @Step("I receive a valid HTTP response code 200")
    public void receivePutHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I should see that the response contains the updated post")
    public void successPutData(){
        restAssuredThat(response -> response.body("'body'", equalTo("No body")));
        restAssuredThat(response -> response.body("'title'", equalTo("Update of the data")));
        restAssuredThat(response -> response.body("'userId'", equalTo("1")));
    }
}
