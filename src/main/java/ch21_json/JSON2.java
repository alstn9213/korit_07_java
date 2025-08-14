package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
         Gson gson = new Gson(); // 한줄로 출력
         Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create(); // prettyPrinting으로 출력


//         1. Java Object -> json으로 변환


        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");
        String jsonUser1 = gsonBuilder.toJson(user1);
        System.out.println(jsonUser1);
        System.out.println();

//        String jsonUser1 = gson.toJson(user1);
//        System.out.println(jsonUser1);


//        2. Map -> json
        Map<String, String> productMap1 = new HashMap<>();
        productMap1.put("productCode", "MYWY3KH/A");
        productMap1.put("productName", "아이폰 16 프로맥스");
        String jsonProduct = gsonBuilder.toJson(productMap1); // toJson 메서드에는 인수로 모든 객체가 들어갈수있다.
        System.out.println(jsonProduct);
        
        /* 
        * gson 객체도 toJson 메서드가 있고 gsonBuilder에도 toJson 메서드가 있다.
        * */

//       3.  json -> Map/Java Object // 형식: gson.fromJson(제이슨데이터, 바꾸고자하는 클래스명.class);

        User user2 = gson.fromJson(jsonUser1, User.class);
        System.out.println(user2);
        Map<String, String> productMap2 = gson.fromJson(jsonProduct, Map.class);
        System.out.println(productMap2);
        
        Map<String, String> userMap1 = gson.fromJson(jsonUser1, Map.class);
        System.out.println(userMap1);

        /*
        * 자바객체로 만든것을 json데이터로 바꾼 다음 Map으로 바꿀수있다.
        * 하지만 Map의 경우 json으로 바꾸는 것은 가능하지만 Java객체로 만들 경우 클래스가 정의되어야한다.
        * */

//        4. json -> jsonObject
        /*
        * json과 jsonObject는 같지 않다.
        * jsonUser1를 선언할 때 자료형을 String으로 했다.
        * 그림 jsonObject는 무슨 타입인가.
        * */

        JsonObject jsonObject1 = gson.fromJson(jsonUser1, JsonObject.class);
        System.out.println(jsonObject1);
        JsonObject jsonObject2 = gsonBuilder.fromJson(jsonUser1, JsonObject.class);
        System.out.println(jsonObject2);

    }
}
