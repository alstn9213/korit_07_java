package ch06_condition;

import java.util.Scanner;

public class Condition10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int max;

//         a>b 라면 max에 a대입 / 아니라면 max에 b를 대입
//        max = (a>b) ? a : b;
//        if(a>b){
//            max = a;
//        } else {
//            max = b;
//        }
//        System.out.println("max에 저장된 값은 ? " + max);
//
//
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();
//        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
//        String result = isLeapYear ? "윤년입니다." : "윤년이 아닙니다.";

//        음수 연도 걸러내기
        String result2 = "";
        boolean isLeapYear2 = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)); //
        if(year < 0) {
            result2 = "불가능한 연도 입력입니다.";
        } else {
            result2 = isLeapYear2 ? "윤년입니다." : "윤년이 아닙니다.";
        }
        System.out.println(year + "년은 "+result2);

//        음수 연도 걸러내기 2
//        String result3 = year < 0 ? "불가능한 연도 입력입니다."
//                : ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//                ? "윤년입니다."
//                : "윤년이 아닙니다.";
//
//        System.out.println(year + "년은 "+result3);
    }
}
