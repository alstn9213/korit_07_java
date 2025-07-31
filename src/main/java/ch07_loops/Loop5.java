package ch07_loops;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {

//        for(int i = 1; i < 6; i++) {
//            for(int j = 1; j < 4; j++) {
//                System.out.println(i+"일차 "+j+"교시입니다.");
//            }
//        }
//        for(int i=2; i<10;i++){
//            for(int j=1;j<10;j++){
//                System.out.println(i+" x "+j+" = "+i*j);
//            }
//        for(int i=1;i<101;i++){
//            System.out.print(i + " ");
//            if(i%10==0) {
//                System.out.println();
//            }
//        }
//        for(int i=1;i<101;i+=10){
//            for(int j=0;j<11;j++){
//                System.out.print(i+j + " ");
//            }
//            System.out.println();
//        }
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        System.out.print("1부터 몇까지 더하시겠습니까? >>>");
//        int num = scanner.nextInt();
//        for(int i = 0; i < num; i++){
//            sum += i;
//        }
//        System.out.println("1부터 " + num + "까지의 합은 " +sum + "입니다.");
//
//        int sum2 = 0;
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
//        int num2 = scanner2.nextInt();
//        for(int i = 0; i < num2+1; i+=2){
//            sum2 += i;
//        }
//        System.out.println("1부터 " + num2 + "까지의 짝수들의 합은 " +sum2 + "입니다.");

        int sum3 = 0;
        int sumEven = 0 ;
        int sumOdd = 0;
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
        int num3 = scanner3.nextInt();
        for(int i = 0; i < num3+1; i++){
            sum3 += i;
            if(i%2==0){
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("1부터 " + num3 + "까지의 짝수들의 합은 " +sumEven + "입니다.");
        System.out.println("1부터 " + num3 + "까지의 홀수들의 합은 " +sumOdd + "입니다.");

    }
}
