import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoTest {
    @Test

        void shouldEcho(){
      given()
              .baseUri("https://postman-echo.com")
              .contentType("text/plain; charset=UTF-8")
              .body("Product")
              .when()
              .post("/post")
              .then()
              .statusCode(200)
              .body("data", equalTo("Product"));
      ;

    }


}
