package ch06_condition;

import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point = 0;
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;
        System.out.print("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        String userGrade = "";
        if(point > 80) {
            userGrade = "VIP";
        } else if(point > 60) {
            userGrade = "GOLD";
        } else if (point > 40) {
            userGrade = "SILVER";
        } else if(point > 20){
            userGrade = "BRONZE";
        } else {
            userGrade = "GENERAL";
        }

        System.out.println("회원등급 : "+userGrade);
        /*

         */
    }
}
