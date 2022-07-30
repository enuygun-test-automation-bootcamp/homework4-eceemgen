import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.http.Unirest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.http.HttpResponse;


public class OrderTest {
@Test
    public void VerifySuccessfullOrder() throws UnirestException {
    Unirest.setTimeouts(0, 0);
    HttpResponse<String> response = (HttpResponse<String>) Unirest.post("https://petstore.swagger.io/v2/store/order")
            .header("Content-Type", "application/json")
            .body("{\n  \"id\": 1,\n  \"petId\": 106,\n  \"quantity\": 2,\n  \"shipDate\": \"2022-07-17T13:49:16.806Z\",\n  \"status\": \"placed\",\n  \"complete\": true\n}")
            .asString();

    Assert.assertEquals(200,response.getClass());
}
}
