package ch12_arrays;

import java.util.Scanner;

public class Array04 {

    public void printElements() {
        String[] names = { "김일", "김이", "김삼", "김사", "김오", "김육"};
        for(int i=0;i<names.length;i++) {
            System.out.print(names[i] + " ");
        }
    }

    public void printElements(String[] strArray) {
        for(int i=0;i<strArray.length;i++) {
            System.out.print(strArray[i] + " ");
        }
    }
    public void printElements(int[] strArray) {
        for(int i=0;i<strArray.length;i++) {
            System.out.print(strArray[i] + " ");
        }
    }

    public void writesElements(String[] strArray) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<strArray.length;i++) {
            System.out.print("이름을 입력하세요 >>> ");
            strArray[i] = scanner.nextLine();
        }
    }

    public void writesElements(double[] doubleArray) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<doubleArray.length;i++) {
            System.out.print((i+1)+" 번째 element 입력하세요 >>> ");
            doubleArray[i] = scanner.nextDouble();
        }
    }


    public static void main(String[] args) {
        Array04 array04 = new Array04();
        String[] people = new String[5];

        array04.writesElements(people);
        array04.printElements(people);

        double[] scores = new double[2];
        array04.writesElements(scores);
//        array04.printElements();
//
//        System.out.println();
//
//        String[] students = {"이일", "이이", "이삼", "이사", "이오"};
//        array04.printElements(students);
//
//        System.out.println();
//
//        String[] teachers = {"안일", "안아", "안삼", "안사"};
//        array04.printElements(teachers);
//
//        System.out.println();
//
//        int[] dates = { 2025, 8, 5};
//        array04.printElements(dates);

    }


}
