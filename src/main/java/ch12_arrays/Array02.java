package ch12_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int human = 0;

        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        human = scanner.nextInt();
        scanner.nextLine();


        String[] humans = new String[human];

        for(int i=0;i<humans.length;i++){
            System.out.print((i+1) + "번 학생의 이름을 등록하세요 >>> ");
            humans[i] = scanner.nextLine();
        }

        double[] scores = new double[human];
        int sum = 0;

        for(int i=0;i<humans.length;i++) {

            System.out.print((i + 1) + "번 학생의 점수를 등록하세요 >>> ");
            scores[i] = scanner.nextDouble();
            sum += scores[i];

        }

        System.out.println("학생들의 평균은 "+sum/scores.length+"입니다.");

        for(int i=0;i<human;i++) {
            if(i == 0 || i == 2) {
                System.out.println(humans[i]+"학생의 점수는 " + scores[i] + "점 입니다.");
            }
        }

    }
}
