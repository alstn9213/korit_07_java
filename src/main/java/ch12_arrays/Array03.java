package ch12_arrays;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int index = 0;
        double sum = 0;

        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        index = scanner.nextInt();
        scanner.nextLine();


        String[] names = new String[index];
        double[] scores = new double[index];


        for(int i=0;i<index;i++){
            System.out.print((i+1) + "번 학생의 이름을 등록하세요 >>> ");
            names[i] = scanner.nextLine();
            System.out.print((i+1) + "번 학생의 점수를 등록하세요 >>> ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();

        }

        System.out.println();

        for(int i=0;i<index;i++){
            System.out.print(names[i]+ " ");
            System.out.print(scores[i] + " ");
            sum += scores[i];
        }

        System.out.println();

        System.out.println("학생들의 점수 총합은 " + sum + "점 입니다.");

    }
}
