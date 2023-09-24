package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.UserDetails.*;

public class UserDetailSteps {
    @Steps
    GetAllCasePositive getAllCasePositive;

    @Steps
    GetAllCaseNegative getAllCaseNegative;

    @Steps
    PostCasePositive postCasePositive;

    @Steps
    PostCaseNegative postCaseNegative;

    @Steps
    GetIDCasePositive getIDCasePositive;

    @Steps
    GetIDCaseNegative getIDCaseNegative;

    @Steps
    PutCasePositive putCasePositive;

    @Steps
    PutCaseNegative putCaseNegative;

    @Steps
    DeleteCasePositive deleteCasePositive;

    @Steps
    DeleteCaseNegative deleteCaseNegative;


    //GET ALL CASE POSITIVE
    @Given("I set GET valid endpoints")
    public void setGetEndpoint(){
        getAllCasePositive.setGetEndpoint();
    }
    @When("I send GET HTTP request for positive case")
    public void sendGetHttpRequestForPositiveCase(){
        getAllCasePositive.sendGetHttpRequest();
    }
    @Then("I receive a valid HTTP response code 200 OK")
    public void receiveHttpResponseCode200(){
        getAllCasePositive.receiveHttpResponseCode200();
    }
    @And("I receive all user details")
    public void validateDataDetailUser(){
        getAllCasePositive.validateDataDetailUser();
    }


    //GET ALL CASE NEGATIVE
    @Given("I set GET invalid endpoints")
    public void setGetInvalidEndpoint(){
        getAllCaseNegative.setGetInvalidEndpoint();
    }
    @When("I send GET HTTP request for negative case")
    public void sendGetHttpRequestForNegativeCase(){
        getAllCaseNegative.sendGetHttpRequest();
    }
    @Then("I receive the response status code is 404 Not Found")
    public void receiveHttpResponseCode404(){
        getAllCaseNegative.receiveHttpResponseCode404();
    }
    @And("I didn't receive all user details")
    public void didNotReceiveAllUserDetails(){
        getAllCaseNegative.didNotReceiveAllUserDetails();
    }

    //POST new user with Valid Data (POSITIVE)
    @Given("I set POST valid endpoints")
    public void setPostEndpoint(){
        postCasePositive.setPostEndpoint();
    }
    @When("I send POST HTTP request for positive case")
    public void sendPostHttpRequestForPositiveCase(){
        postCasePositive.sendPostHttpRequest();
    }
    @Then("I receive a valid HTTP response code 201")
    public void receiveHttpResponseCode201(){
        postCasePositive.receiveHttpResponseCode201();
    }
    @And("I should see that the response contains the newly created post data")
    public void successPostData(){
        postCasePositive.successPostData();
    }


    //POST new user without request body (NEGATIVE)
    @Given("I set a POST valid endpoints")
    public void setAPostEndpoint(){
        postCaseNegative.setAPostEndpoint();
    }
    @When("I send POST HTTP request for negative case")
    public void sendPostHttpRequestForNegativeCase(){
        postCaseNegative.sendPostHttpRequest();
    }
    @Then("I receive a valid HTTP response code 500 Internal Server Error")
    public void receiveHttpResponseCode500(){
        postCaseNegative.receiveHttpResponseCode500();
    }
    @And("I don't receive a new user data")
    public void unsuccessPostData(){
        postCaseNegative.unsuccessPostData();
    }


    //GET BY ID (POSITIVE)
    @Given("I set GET valid endpoints by ID=1")
    public void setGetEndpointByID(){
        getIDCasePositive.setGetEndpoint();
    }
    @When("I send HTTP request GET for positive case")
    public void sendHttpRequestGetForPositiveCase(){
        getIDCasePositive.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 OK")
    public void receiveHttpResponseCode200OK(){
        getIDCasePositive.receiveHttpResponseCode200();
    }
    @And("I receive data of user with ID=1")
    public void DataDetailUserByID(){
        getIDCasePositive.validateDataDetailUser();
    }

    //GET BY ID (NEGATIVE)
    @Given("I set GET endpoints with ID=101")
    public void setGetEndpointByInvalidID(){
        getIDCaseNegative.setGetInvalidID();
    }
    @When("I send HTTP request GET for negative case")
    public void sendHttpRequestGetForNegativeCase(){
        getIDCaseNegative.sendGetHttpRequest();
    }
    @Then("I receive response status code is 404 Not Found")
    public void receiveHttpResponseCode404NotFound(){
        getIDCaseNegative.receiveHttpResponseCode404();
    }
    @And("I didn't receive user details from ID=101")
    public void didNotReceiveUserDetails(){
        getIDCaseNegative.didNotReceiveUserDetails();
    }



    //PUT with Valid ID (POSITIVE)
    @Given("I set PUT endpoints with ID=1")
    public void setPutEndpoint(){
        putCasePositive.setPutEndpoint();
    }
    @When("I send PUT HTTP request for positive case")
    public void sendPutHttpRequestForPositiveCase(){
        putCasePositive.sendPutHttpRequest();
    }
    @Then("I receive a valid HTTP response code 200")
    public void receivePutHttpResponseCode200(){
        putCasePositive.receivePutHttpResponseCode200();
    }
    @And("I should see that the response contains the updated post")
    public void successPutData(){
        putCasePositive.successPutData();
    }


    //PUT with invalid ID (NEGATIVE)
    @Given("I set a PUT endpoints with ID=101")
    public void setPutEndpointWithInvalidID(){
        putCaseNegative.setPutEndpointWIthInvalidID();
    }
    @When("I send PUT HTTP request for negative case")
    public void sendPutHttpRequestForNegativeCase(){
        putCaseNegative.sendPutHttpRequest();
    }
    @Then("I receive valid HTTP response code 500 Internal Server Error")
    public void receivePutHttpResponseCode500(){
        putCaseNegative.receivePutHttpResponseCode500();
    }
    @And("I can't update a post data and I should see that the response contains an error message")
    public void unsuccessPutData(){
        putCaseNegative.unsuccessPutData();
    }



    //DELETE BY ID (POSITIVE)
    @Given("I set DELETE endpoints with ID=1")
    public void setDeleteEndpointByID(){
        deleteCasePositive.setDeleteEndpoint();
    }
    @When("I send DELETE HTTP request")
    public void sendHttpRequestDeleteForPositiveCase(){
        deleteCasePositive.sendDeleteHttpRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveHttpDeleteResponseCode200OK(){
        deleteCasePositive.receiveHttpResponseCode200();
    }

    //DELETE BY ID (NEGATIVE)
    @Given("I set DELETE endpoints with ID=101")
    public void setDeleteEndpointByInvalidID(){
        deleteCaseNegative.setDeleteInvalidID();
    }
    @When("I send HTTP request DELETE for negative case")
    public void sendHttpRequestDeleteForNegativeCase(){
        deleteCaseNegative.sendDeleteHttpRequest();
    }
    @Then("I receive response status code is 404")
    public void receiveHttpDeleteResponseCode404(){
        deleteCaseNegative.receiveHttpDeleteResponseCode404();
    }
    @And("I should see that the response contains an error message")
    public void unsuccessDelete(){
        deleteCaseNegative.unsuccessDelete();
    }


}
