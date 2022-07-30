
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.http.HttpResponse;

    public void  Inventory {
        @Test
        public void ReturnsPetInventories() throws UnirestException {
            Unirest.setTimeouts(0, 0);
            HttpResponse<String> response = (HttpResponse<String>) Unirest.get("https://petstore.swagger.io/v2/store/inventory")
                    .asString();


            Assert.assertEquals(200,response.getClass());
        }


    }

}
