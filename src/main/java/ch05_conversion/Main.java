package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        // 1. upcasting(업캐스팅): 더 큰 용량의 자료형으로 변환시키는 것

//        변수 선언 및 초기화
//        자료형 변수명 = 값;
        char cast1 = 'A';
        System.out.println("원형: " + cast1);

//       업캐스팅 방법 #1

//       형변환을 하기위해서는 '(바꿀 데이터 타입) 변수명'
        System.out.println("변형: " + (int)cast1); // A 유니코드는 65

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2); // a 유니코드는 97

//        업캐스팅 방법 #2
//        새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방법.
        char cast3 = 'b';
        int casted3 = cast3;
        System.out.println("원형 : "+ cast3);
        System.out.println("번형 : "+ casted3);
//----------------------------------------------------------------------
//        다운캐스팅 : 용량이 더 적은 자료형으로 변형하는 것을 의미.
        int cast4 = 99; // #1의 방법
        int cast5 = 100; // #2의 방법
        System.out.println();

//        2. downcasting(다운캐스팅)방법 #1
        System.out.println("원형: " + cast4);
        System.out.println("변형: " + (char)cast4);

//        다운캐스팅 방법 #2
        char casted5 = (char)cast5;
        System.out.println("원형: " + cast5);
        System.out.println("변형: " + casted5);

        /*
        업캐스팅은 타입의 메모리 용량이 커지니까 암시적 변형이 가능.
        다운 캐스팅은 타입의 메모리 용량이 작아지니 명시적으로 변환해야함.

        int는 21억정도의 범위이고 더 큰 숫자로 표기하려면, 정수 기준 long
        cf) SQL 에서는 bigint
         */

    }
}
