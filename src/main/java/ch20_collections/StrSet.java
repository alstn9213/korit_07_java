package ch20_collections;

import java.util.*;

public class StrSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        List<String> strList = new ArrayList<>();

        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("python");
        strList.add("python");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        System.out.println(strList);

        strSet.add("TypeScript");
        System.out.println(strSet);

        strSet.addAll(strList);
        System.out.println(strList); // list는 그대로 유지
        System.out.println(strSet); // set에 중복이 제거된 채 요소들이 더해짐
        System.out.println(strSet.size());

        List<String> modifiedStrList = new ArrayList<>();
        modifiedStrList.addAll(strSet);
        System.out.println(modifiedStrList);
        Collections.sort(modifiedStrList);
        System.out.println(modifiedStrList);

        for(int i=0;i<modifiedStrList.size();i++){
            System.out.println(modifiedStrList.get(i) + " 언어");
        }
        for(String str : modifiedStrList) {
            System.out.println(str + " 언어");
        }
    }
}
