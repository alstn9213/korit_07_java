package self;

import java.util.*;

public class TransEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("a");
//        list.add("a");
//        list.add("b");
//        list.add("b");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("d");
//        list.add("d");

        Set<Map.Entry<String, String>> set = new HashSet<>();
//        set.addAll(list);
//        System.out.println(set);

        Map<String, String> map = new HashMap<>();
        map.put("1","일");
        map.put("2","이");
        map.put("3","삼");
        map.put("4","사");
        map.put("5","오");
        Set<Map.Entry<String, String>> set2 = map.entrySet();
        System.out.println(set2);
//        list.addAll(set2);
        System.out.println(list);

    }
}
