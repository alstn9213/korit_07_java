package ch22_exception.age_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeMain {
    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 0 || age > 200) {
            throw new InvalidAgeException("나이는 0 ~ 200 사이의 정수만 가능합니다.");
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt(); // 음수값이나 200초과 정수를 넣을 수 있어 예외가 발생할 수 있느 부분.
        try {
            int age = scanner.nextInt();
            checkAge(age);
            System.out.println("입력된 나이는 : " + age + "살입니다.");
        } catch (InvalidAgeException e) {
            System.out.println("나이 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) { // InputMismatchException는 scanner를 사용했는데 변수의 자료형과 일치하지 않을 때 적용됨.
            System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
        } finally {
            System.out.println("프로그램 정상 종료");
        }


    }
}
