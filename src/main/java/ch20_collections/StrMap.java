package ch20_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        strMap1.put("kor2025001", "김일");
        strMap1.put("kor2025002", "김이");
        strMap1.put("kor2025003", "김삼");
        strMap1.put("kor2025004", "김사");
        strMap1.put("kor2025005", "김오");
//        map은 순서보장이 안된다.
        System.out.println(strMap1);
//        key 하나당 value는 하나이기 때문에 키가 같다면 값이 덮어써진다.
        strMap1.put("kor2025005", "kimfive");
        System.out.println(strMap1);
//        List의 경우 순서가 있기때문에 인덱스를 통한 조회가 가능하다. 하지만 Map의 경우 순서가 보장되지않아 Key값을 통해 조회한다.
        System.out.println(strMap1.get("kor2025001")+" 님");

        Map<String, Double[]> koreanScores = new HashMap<>();
        koreanScores.put("김일", new Double[2]);


        Map<String, Double> koreanScores2 = new HashMap<>();
//        특정 key 수정 #1
        koreanScores2.put("김일", 98.2);
        koreanScores2.put("김이", 100.0);
        koreanScores2.put("김삼", 22.2);
        koreanScores2.put("김사", 67.4);
        koreanScores2.put("김오", 70.2);
        System.out.println(koreanScores2);
        koreanScores2.put("김오", 4.5);
        System.out.println(koreanScores2);

//        특정 key 수정 #2 .replace() // 인수로 넣는 키가 없으면 무시한다.
        koreanScores2.replace("김오", 789.2);
        System.out.println(koreanScores2);

//        두가지 방법이 있는 이유는 .put()의 경우 키가 없다면 키를 생성해서 값을 초기화하지만 .replace는 키가 없을 경우 갱신이 일어나지않기때문이다.

//        특정 키의 존재여부 -> containsKey() 불리언출력
        boolean searchKeyFlag1 = strMap1.containsKey("김육");
        System.out.println(searchKeyFlag1);

//        특정 value 존재여부 -> containsValue() 불리언출력
        boolean searchValueFlag1 = strMap1.containsValue("김삼");
        System.out.println(searchValueFlag1);

//        Map 엔트리로 부터 Set생성
//        Set안에 Key가 String, Value가 String인 Map이 들어간다.
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();

//        strMap1의 key-value쌍을 Set으로 바꾸는 메서드인 .entrySet()의 호출 결과를 entrySet2 변수에 담는다.
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();
        System.out.println(strMap1);
        System.out.println(entrySet2);

//        Map -> Set -> List로만 변환이 가능함
        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
//        Map -> List로의 직접 변환은 불가능하다.
//        List<Map.Entry<String, String>> entryList2 = strMap1.entrySet();

        entryList1.addAll(entrySet2);
        System.out.println(entryList1); // List로 바꾸어 .sort()와 요소추출이 가능해짐


//        Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);

//        Set<String> valueSet = strMap1.values(); // values는 Collection<String> 타입을 반환하는데 참조변수는 Set<String>타입이다. 이는 다운캐스팅으로 해결해야한다.
//        그래서 명시적으로 다운캐스팅해서 Set<String> valueSet = (Set<String>) strMap1.values();을 하면 컴파일 오류가 뜬다.
//        이건 values의 반환값은 Collections인데 Set이 담을수 있는 타입은 String이기 때문이다.
//
        Collection<String> values = strMap1.values();
        System.out.println(values);
    }
}
