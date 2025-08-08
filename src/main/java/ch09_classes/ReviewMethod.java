package ch09_classes;

import java.util.Scanner;

public class ReviewMethod {
//    메서드정의 영역
    public void writeSchedule(String date, String content) {
        System.out.println(date + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }
//    메서드 오버로딩
    public void writeSchedule(int date, String content) {
        System.out.println(date + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }
//    call1 유형
    public void dividedBySeven() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("임의의 숫자를 입력하세요 >>> ");
    int n = scanner.nextInt();
    if(n%7 == 0) {
        System.out.println(n + "은 7의 배수입니다.");
    } else {
        System.out.println(n + "은 7의 배수가 아닙니다.");
    }
}
//   call2 유형
    public void dividedBySeven(int n) {

        if(n%7 == 0) {
            System.out.println(n + "은 7의 배수입니다.");
        } else {
            System.out.println(n + "은 7의 배수가 아닙니다.");
        }
    }

    public static void main(String[] args) {
//            메서드 호출영역
        ReviewMethod reviewMethod = new ReviewMethod();
        reviewMethod.writeSchedule("20250804", "메서드/오버로딩/클래스복습");

//        오버로딩 메서드 호출
        reviewMethod.writeSchedule(20250804, "클래스/getter/setter 복습");

//        call2유형
        Scanner scanner = new Scanner(System.in);
        System.out.print("임의의 숫자를 입력하세요 >>> ");
        int n = scanner.nextInt();
        reviewMethod.dividedBySeven(n);

//       call1유형
        reviewMethod.dividedBySeven();
    }

}
