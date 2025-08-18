package ch23_lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");
        System.out.println(fruits);

//       1. 각 element를 추출하기 위해 for문을 사용해왔다.
//        일반 for문
        for(int i=0;i<fruits.size();i++){
            System.out.println("과일명 : " + fruits.get(i));
        }
        System.out.println();

//        2. 향상된 for문
        for(String fruit : fruits) {
            System.out.println("과일명 : " + fruit);
        }
        System.out.println();

//        3. lambda식을 적용한 method forEach
        fruits.forEach(fruit -> System.out.println("과일명 : " + fruit));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.print((number*2) + " "));

//        forEach() 메서드 내에 람다식을 작성함으로써 읽을 수만있다면 가독성 있는 형태로 데이터를 가공할 수 있다.
    }
}
