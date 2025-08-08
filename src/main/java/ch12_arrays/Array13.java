package ch12_arrays;

import java.util.Arrays;

public class Array13 {
    public static void main(String[] args) {
        int[][] arr03 = { {1,2}, {3,4}, {5,6} };
        System.out.println(arr03[2][0]); // 5
        System.out.println(arr03[2]); //[I@36baf30c
        System.out.println(arr03); //[[I@7a81197d
        System.out.println(Arrays.toString(arr03)); // [[I@5ca881b5, [I@24d46ca6, [I@36baf30c]

        for(int i=0;i< arr03.length;i++) {
            for(int j=0;j<arr03[i].length;j++){
                System.out.println(arr03[i][j]);
            }
        }
        System.out.println();
//        향상된 for문으로 2차 배열
        for(int[] numRow : arr03) {
            for(int numColumn : numRow) {
                System.out.print(numColumn);
            }
        }
        System.out.println();
    }
}
