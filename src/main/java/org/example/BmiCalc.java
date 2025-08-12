package org.example;

import java.util.Scanner;


public class BmiCalc {
    public void calcBmi() {

        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble();
        System.out.print("몸무게를 입력하세요 >>> ");
        double weight = scanner.nextDouble();
//        체중 / (신장 * 신장)


        double result = weight / (height * height / 10000);

        if(result < 18.5) {
            str = "저체중";

        } else if(result < 23) {
            str = "정상";

        } else if (result < 25) {
            str = "비만 전 단계";

        } else if (result < 30) {
            str = "1단계 비만";

        } else if (result <35) {
            str = "2단계 비만";

        } else  {
            str = "3단계 비만";
        }
        System.out.println(name + "님의 BMI 지수는" + result + "으로 " + str + "입니다.");
        System.out.println(name + "님의 BMI 지수는" + result + "으로 " + str + "입니다.");
    }
    public void calcBmi(String name, double height, double weight) {

//        체중 / (신장 * 신장)
        double result = weight / (height * height / 10000);
        String str = "";
        if(result < 18.5) {
            str = "저체중";

        } else if(result < 23) {
              str = "정상";

        } else if (result < 25) {
             str = "비만 전 단계";

        } else if (result < 30) {
            str = "1단계 비만";

        } else if (result <35) {
            str = "2단계 비만";

        } else  {
            str = "3단계 비만";
        }
        System.out.println(name + "님의 BMI 지수는" + result + "으로 " + str + "입니다.");
    }
    public void calcBmi(Person person) {


//        체중 / (신장 * 신장)
        double result = person.getWeight() / (person.getHeight() * person.getHeight() / 10000);
        String str = "";
        if(result < 18.5) {
            str = "저체중";

        } else if(result < 23) {
            str = "정상";

        } else if (result < 25) {
            str = "비만 전 단계";

        } else if (result < 30) {
            str = "1단계 비만";

        } else if (result <35) {
            str = "2단계 비만";

        } else  {
            str = "3단계 비만";
        }
        System.out.println(person.getName() + "님의 BMI 지수는" + result + "으로 " + str + "입니다.");
    }
    public static void main(String[] args) {
        BmiCalc bmiCalc = new BmiCalc();

//        bmiCalc.calcBmi(); // call1

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble();
        System.out.print("몸무게를 입력하세요 >>> ");
        double weight = scanner.nextDouble();
//        bmiCalc.calcBmi(name, height, weight); // call2

        bmiCalc.calcBmi(new Person.PersonBuilder().height(height).weight(weight).name(name).build());

    }
}
