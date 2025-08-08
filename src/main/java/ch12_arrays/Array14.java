package ch12_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int num = 1;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = num;
                num++;
            }
        }

        for(int[] firstArray : nums) {
            for(int secondArray : firstArray) {
                System.out.println(secondArray);
            }
        }
        for(int[] firstArray : nums) {
            System.out.println(Arrays.toString(firstArray));
        }

        System.out.println(Arrays.deepToString(nums));
    }
}
