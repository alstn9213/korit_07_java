package self.Test;

import java.util.*;

public class MapList {
    public static void main(String[] args) {
        List<Map.Entry<String, Object>> customers = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();

        map1.put("name", "홍길동");
        map1.put("rating", "vip");
        map1.put("age", "30");

        map2.put("name", "김기영");
        map2.put("rating", "gold");
        map2.put("age", "35");


        Set<Map.Entry<String, Object>> set1 = map1.entrySet();
        Set<Map.Entry<String, Object>> set2 = map2.entrySet();

        customers.addAll(set1);
        customers.addAll(set2);

        for(Map.Entry<String, Object> customer : customers) {
            System.out.println(customer);
        }
    }
}
