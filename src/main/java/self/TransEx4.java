package self;

import java.util.*;

public class TransEx4 {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();

        strMap1.put("kor2025001", "김일");
        strMap1.put("kor2025002", "김이");
        strMap1.put("kor2025003", "김삼");
        strMap1.put("kor2025004", "김사");
        strMap1.put("kor2025005", "김오");

//        entrySet1.addAll(strMap1);
//        entrySet1 = strMap1.entrySet();
        System.out.println(entrySet1);

//        System.out.println(strMap1.values());

//        Set<Map.Entry<String, String>> entrySet2 = new HashSet<>(strMap1.entrySet());
//        List<Map.Entry<String, String>> entryList1 = new ArrayList<>(strMap1.entrySet());

//        System.out.println(entryList1);
//        System.out.println(entrySet2);
//        entryList1.addAll(entrySet2);
//        System.out.println(entryList1);


    }
}
