package ch08_methods;

import java.util.Scanner;

public class Method01 {
//    메서드 정의 영역
//    1. [ x | x ] [ 입력값 / 출력값 ]
    public static void call1() {
        System.out.println("[ x | x ]");
    }

//    2. [ o | x ]
    public static void call2(String example) {
        System.out.println("[ o | x ]");
        System.out.println("영어 인사 : " + example);
    }

//    3. [ x | o ]

    public static int call3And1() {
        System.out.println("[ x | o ]");
        return 1;
    }
//    4. [ o | o ]
    public static double call4(double score) {
        System.out.println("[ o | o ]");
        System.out.println("해당 과목은 3학점짜리입니다.");
        return score * 3;
    }
    public  static  String introduce(String name, int age){
        return "제 이름은 " + name + "이고, 나이는 " + age + "살입니다.\n 내년에는 " + (age + 1)+"살이 됩니다.";
    }

    public static void main(String[] args) {
//   메서드 호출 영역
//        call1();
//        call2("hello");
//        call3And1();
//
////        return값을 출력하기 위해서는
//        System.out.println(call3And1() + "!");
//        String name = "김일";
////        결과값에 추가적인 연산을 하기 위해 이런 방식을 사용한다.
//        System.out.println(name + " 학생의 학점은 "+call4(4.5)+"점입니다.");

        Scanner scanner = new Scanner(System.in);
        String myName = "";
        int myAge = 0;
        System.out.print("이름을 입력하세요 >>> ");
        myName = scanner.nextLine(); // nextLine()은 메서드 -> 메서드의 결과값을 myName이라는 변수에 저장
        System.out.print("나이를 입력하세요 >>> ");
        myAge = scanner.nextInt();
        System.out.println(introduce(myName, myAge)); // 그리고 myName / myAge라는 결과값을 미리 정의한 introduce()메서드의 argument로 사용하여 최종 결과물을 콘솔에 출력한다.

    }
}
