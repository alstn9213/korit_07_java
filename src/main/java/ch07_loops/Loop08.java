package ch07_loops;

import java.util.Scanner;

public class Loop08 {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            for(int j=5;j-i>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j-i<0;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=0;i<6;i++){
            for(int j=5;j-i>0;j--){
                System.out.print("*");
            }
            for(int j=0;j-i<0;j++){
                System.out.print(" ");
            }
            System.out.println();

        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("숫자를 입력하세요 >>> ");
//        int n = scanner.nextInt();
//        for(int i=0;i<n+1;i++){
//            for(int j=n;j-i>0;j--){
//                System.out.print(" ");
//            }
//            for(int j=0;j-i<0;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }
}
