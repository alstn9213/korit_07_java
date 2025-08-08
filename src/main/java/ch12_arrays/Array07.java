package ch12_arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int d = 0;
//        int f = 0;
//        for(int i=0; i<scores.length;i++){ // 100점 초과나 0점 이하는 배열을 만들 때 걸러내기 때문에 조건문에서 다시 걸러낼 필요는 없다.
//            if(scores[i] > 89) {
//                a++;
//            } else if(scores[i] >79) {
//                b++;
//            } else if (scores[i] > 69) {
//                c++;
//            } else if (scores[i] > 59) {
//                d++;
//            } else {
//                f++;
//            }
//        }
//        System.out.println("A학생 수 : " + a);
//        System.out.println("B학생 수 : " + b);
//        System.out.println("C학생 수 : " + c);
//        System.out.println("D학생 수 : " + d);
//        System.out.println("F학생 수 : " + f);
//        변수선언을 줄이려면 배열로 한번에 선언

        int[] grades = {0,0,0,0,0};
        for(int i=0; i<scores.length;i++){
            if(scores[i] > 89) {
                grades[0]++;
            } else if(scores[i] >79) {
                grades[1]++;

            } else if (scores[i] > 69) {
                grades[2]++;

            } else if (scores[i] > 59) {
                grades[3]++;

            } else {
                grades[4]++;
            }
        }
        System.out.println("A학생 수 : " + grades[0]);
        System.out.println("B학생 수 : " + grades[1]);
        System.out.println("C학생 수 : " + grades[2]);
        System.out.println("D학생 수 : " + grades[3]);
        System.out.println("F학생 수 : " + grades[4]);


    }
}
