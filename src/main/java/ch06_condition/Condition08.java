package ch06_condition;

import java.util.Scanner;

public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        String leapYear = "윤년";
        System.out.print("연도를 입력하세요 >>> ");
        year = scanner.nextInt();
        if(year % 4 == 0) {
            if (year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println(leapYear+"입니다.");
                } else {
                   System.out.println(leapYear+"이 아닙니다.");
                }
            }
        } else {
                System.out.println(leapYear+"이 아닙니다.");
            }

//        leapYear = "윤년입니다.";
//
//        if(year % 400 == 0) {
//
//        } else if (year % 100 == 0) {
//            leapYear = "윤년이 아닙니다.";
//        } else if (year % 4 == 0) {
//
//        } else {
//            leapYear = "윤년이 아닙니다.";
//        }
//        System.out.println(year+"년은 "+leapYear);
    }
    }

