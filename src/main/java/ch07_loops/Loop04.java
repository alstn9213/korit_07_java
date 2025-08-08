package ch07_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
//        for(int i = 1; i < 101; i++) {
//            System.out.println(i);
//        }
//        System.out.println(i); // 지역변수 i
//        int sum = 0;
//        for(int i = 0; i < 100; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//        int sum = 0;
//        for(int i = 0; i<100; i++) {
//            if(i%2==1) {
//                sum += i;
//
//            }
//        }
//        System.out.println(sum);

//        int sum = 0;
//        for(int i = 1; i<100; i+=2) {
//
//                sum += i;
//        }
//        System.out.println(sum);
//
//
        int sum2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>> ");
        int num = scanner.nextInt();
        for(int i =1; i<=num;i++){
            sum2 += i;
        }
        System.out.println("1부터 " + num + "까지의 합은 "+ sum2 +"입니다.");


    }
}
