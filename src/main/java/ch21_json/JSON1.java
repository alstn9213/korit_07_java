package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
//        속성(키-값 쌍) 을 추가하는 메서드 -> addProperty() 메서드

        jsonObject1.addProperty("username", 1);
        jsonObject1.addProperty("password", 1234);
        jsonObject1.addProperty("email", "a@test.com");
        jsonObject1.addProperty("name", "김일");
        jsonObject1.addProperty("score", 4.5);

        System.out.println(jsonObject1);  // {"username":1,"password":1234,"email":"a@test.com","name":"김일","score":4.5}

        jsonObject1.addProperty("job", "코리아아이티국비강사");
        System.out.println(jsonObject1);
        /*
        콘솔에는 Json결과값이 한줄로 이어진다.
         */
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonData = gson.toJson(jsonObject1);
        System.out.println(jsonData);
        /*
        json에서 객체는 String타입
        **/
    }
}
