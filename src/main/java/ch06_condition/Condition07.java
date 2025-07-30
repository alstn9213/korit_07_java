package ch06_condition;

import java.util.Scanner;

public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        String grade = "";
        System.out.print("점수를 입력하세요 >>>");
        score = scanner.nextInt();

        if(score > 100 || score < 0) {
            System.out.println("뷸가능한 점수 입력입니다.");
            grade = "X";
        } else { // score가 0이상 100이하일 경우 실행.
            if(score > 89) {
                grade = "A";
            } else if(score > 79) {
                grade = "B";
            } else if(score > 69) {
                grade = "C";
            } else if(score > 59) {
                grade = "D";
            } else {
                grade = "F";
            }

        }

    }
}
