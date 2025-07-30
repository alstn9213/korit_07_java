package ch06_condition;

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        int num1 = 10;
        if(num1 > 0) {
            System.out.println("num1은 양수입니다.");
        }

        if(num1 > 15) {
            System.out.println("num1은 15초과입니다.");
        }

//        scanner import
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>> ");
        int num2 = scanner.nextInt();

        if(num2 > 0) {
            System.out.println("num2는 양수입니다.");
        }
        System.out.println("프로그램 종료");


    }
}
