package ch07_loops;

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
//        int row = scanner.nextInt();
//        for(int i=0;i<row+1;i++){
//            for(int j=0;j<i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        int row = scanner.nextInt();
        for(int i=row+1;i>0;i--){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
