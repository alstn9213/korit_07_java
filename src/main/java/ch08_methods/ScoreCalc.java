package ch08_methods;

import java.util.Scanner;

public class ScoreCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int numOfsubs = 0;
        double score = 0;

        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfsubs = scanner.nextInt();;
        for(int i=0;i<numOfsubs;i++){
            System.out.print((i+1)+"과목의 점수를 입력하세요 >>> ");
            score = scanner.nextDouble();
            sum += score;
        }
        avg = sum/numOfsubs;
        System.out.println("총합은 "+sum+"이며, 평균은 "+avg+"입니다.");

    }
}
