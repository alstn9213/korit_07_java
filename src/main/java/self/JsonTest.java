package self;

import com.google.gson.Gson;
import com.google.gson.JsonObject;



public class JsonTest {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        Gson gson = new Gson();
        String jsonData = gson.toJson(jsonObject1);
        JsonObject jsonObject2 = gson.fromJson(jsonData, JsonObject.class);
        System.out.println(jsonObject2);
    }
}
