package ch20_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        String[] strArray = new String[5];

        strArray[0] = "김영";
        strList.add("java");
        strList.add("python");
        strList.add("javascript");
        strList.add("C#");
        strList.add("C++");
//        집어넣은 순서대로 들어간다.

        System.out.println(strArray); // [Ljava.lang.String;@36baf30c
        System.out.println(Arrays.toString(strArray));
//        List에 toString()이 오버라이딩 돼있다.
        System.out.println(strList); // [java, javascript, C#, C++]

        String searchElement1 = "python";
        boolean contains1 = strList.contains(searchElement1);
        System.out.println(searchElement1 + " 포함 여부 : " + contains1);

        String searchElement2 = "py";
        boolean contains2 = strList.contains(searchElement2);
        System.out.println(searchElement2 + " 포함 여부 : " + contains2);

        String removeElem1 = "javascript";
        boolean isRemoved = strList.remove(removeElem1);
        System.out.println(removeElem1 + "삭제여부 : " + isRemoved);

        Collections.sort(strList); // 배열정렬과 같음. 원본 List의 값을 바꿈
        System.out.println(strList);

//        List의 역순 정렬
        Collections.sort(strList, Comparator.reverseOrder());
        System.out.println(strList);

//      전체 element들 출력
//        1. 배열
        for(int i=0; i<strArray.length;i++){
            System.out.println(strArray[i]);
        }
        for(String str : strArray) {
            System.out.println(str);
        }
        System.out.println();
        for(int i=0;i<strList.size();i++){
            System.out.println(strList.get(i));
        }
        System.out.println();
        for(String elem : strList) {
            System.out.print(elem + " ");
        }
    }
}
