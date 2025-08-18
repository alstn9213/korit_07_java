package self.collections;

import java.util.*;

public class HashMapEx01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1번", "김일");
        map.put("2번", "김이");
        map.put("3번", "김삼");

//       ------- Map의 요소를 다른 타입으로 반환하는 Map 메서드들-----------

//        keySet()메서드는 Map의 모든 key를 Set 객체로 반환한다.
        Set<String> keySet = map.keySet();
        System.out.println(keySet);


//        values()메서드는 Map의 모든 value를 Collection 객체로 반환한다.
        Collection<String> values = map.values();
        System.out.println(values);


//        entrySet()메서드는 Map의 key와 value를 Set<Map.Entry<K, V>> 객체로 반환한다.
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

//     Map -> Set -> List 변환
//        Map은 List로의 직접적인 변환이 불가능해서 Map을 우선 Set으로 변환해야함
        List<Map.Entry<String, String>> entryList = new ArrayList<>();
//        Set으로 변환한 값을 addAll()메서드의 인자로 사용
        entryList.addAll(entrySet);
        System.out.println("List: "+entryList);

//        Set<Collections> valueSet = map.values();
//        System.out.println(valueSet);


//      List<Map.Entry<String, String>> entryList = map.entrySet();






    }
}
