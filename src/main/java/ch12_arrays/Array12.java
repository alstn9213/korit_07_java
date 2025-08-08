package ch12_arrays;

import ch08_methods.Method01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int num1 = random.nextInt();
//        System.out.println(num1);
//
//        System.out.print("숫자를 입력하세요 >>> ");
//        int num2 = scanner.nextInt();
//        System.out.println(num2);

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(numbers));
//        Method01.call1();
        System.out.println();
        Integer[] nums = {3,6,7,1,9,2,10,5,4,8};
        System.out.println("정렬 전 배열 : "+Arrays.toString(nums));

        Arrays.sort(nums); // sort의 반환값이 void니까 원본 배열에 접근해서 정렬함

        // 내림차순 정렬
//        마찬가지로 원본 배열 다 바꿈
//        내림차순 정렬 메서드는 오름차순과 달리 인자가 하나 더 들어간다는 점에서 오버로딩된 메서드라는 것을 알 수 있다.
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 : " + Arrays.toString(nums));

//        그런데 Comparator.reverseOrder() 메서드를 쓰려면 기본 자료형 배열을 사용할 수 없어서 Integer[] 배열을 사용하였다.
    }
}
