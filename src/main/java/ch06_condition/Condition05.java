package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int score = 0;
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        String grade = "";
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
        System.out.println("당신의 점수는 "+score+"점이고, 학점은 "+grade+"입니다.");
    }
}
