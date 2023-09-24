package starter.UserDetails;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class DeleteCasePositive {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set DELETE endpoints with ID=1")
    public String setDeleteEndpoint(){

        return url + "posts/1";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        SerenityRest.given()
                .when()
                .delete(setDeleteEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void receiveHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
