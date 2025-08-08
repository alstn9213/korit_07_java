package ch12_arrays;


import java.util.Scanner;

public class Array05 {
    void printScore(String[] strArr) {
        for(int i=0;i<strArr.length;i++){
            if(i == strArr.length-1) {
                System.out.print(strArr[i]);
                return;
            }
            System.out.print(strArr[i]+"+ ");
        }

    }
    public static void main(String[] args) {
//        String[] scores = {"A","B","C","D","F"};
//        Array05 array = new Array05();
//        System.out.println();
//        array.printScore(scores);
//        System.out.println();

        String[] scores = new String[6];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<scores.length;i++){
            scores[i] = scanner.nextLine();
        }
    }
}
