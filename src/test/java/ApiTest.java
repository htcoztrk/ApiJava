import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTest {

    @Test
    public void testGetRequest() {
        // Bir örnek GET isteği
        HttpResponse<JsonNode> response = Unirest.get("https://jsonplaceholder.typicode.com/posts/1")
                .asJson();

        // Yanıtı kontrol et
        assertEquals(200, response.getStatus());
        JsonNode body = response.getBody();
        System.out.println(body.toString());

        // Yanıtın id alanını kontrol et
        assertEquals(1, body.getObject().getInt("id"));
    }
    @Test
    public void testGetRequest2() {
        // Bir örnek GET isteği
        HttpResponse<JsonNode> response = Unirest.get("https://jsonplaceholder.typicode.com/posts/1")
                .asJson();

        // Yanıtı kontrol et
        assertEquals(200, response.getStatus());
        JsonNode body = response.getBody();
        System.out.println(body.toString());

        // Yanıtın id alanını kontrol et
        assertEquals(1, body.getObject().getInt("id"));
    }
}
