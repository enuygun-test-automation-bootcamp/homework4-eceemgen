import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.http.HttpResponse;



    public class Purchase {
        @Test
        public void FindPurchaseOrder() throws UnirestException {
            Unirest.setTimeouts(0, 0);
            HttpResponse<String> response = Unirest.get("https://petstore.swagger.io/v2/store/order/1")
                    .body("")
                    .asString();


            Assert.assertEquals(200,response.getClass());
        }

    }
}
