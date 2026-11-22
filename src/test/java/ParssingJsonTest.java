import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ParssingJsonTest {
    @Test
    public void testParsJson(){
        JsonPath jsonpathOtrzymany = RestAssured
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();


        List otrzymany = jsonpathOtrzymany.getList("messages");
        System.out.println(otrzymany.get(1));
    }
}
