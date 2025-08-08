package ch06_condition;

import java.util.Scanner;

public class Condition11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedNum;

        System.out.println("[메뉴 선택]");
        System.out.println("a. Java를 공부한다.");
        System.out.println("b. Python을 공부한다.");
        System.out.println("c. JavaScript를 공부한다.");
        System.out.println("d. HTML을 공부한다.");
        System.out.println("e. 자습한다.");
        System.out.println("f. 쉰다.");
        System.out.print("메뉴를 선택하세요 >>> ");
        String selectedChar = scanner.nextLine();
        switch(selectedChar) {
            case "a":
                System.out.println("메뉴 a을 선택하셨습니다.");
                break;
            case "b":
                System.out.println("메뉴 b를 선택하셨습니다.");
                break;
            case "c":
                System.out.println("메뉴 c을 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴 d를 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴 e를 선택하셨습니다.");
                break;
            case "f":
                System.out.println("메뉴 f을 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
        }

//         if문을 사용할 경우 일이 복잡해진다.
//        selectedNum = scanner.nextInt();
//
//        System.out.println("[메뉴 선택]");
//        System.out.println("1. Java를 공부한다.");
//        System.out.println("2. Python을 공부한다.");
//        System.out.println("3. JavaScript를 공부한다.");
//        System.out.println("4. HTML을 공부한다.");
//        System.out.println("5. 자습한다.");
//        System.out.println("6. 쉰다.");
//        System.out.print("메뉴를 선택하세요 >>> ");
//        if (selectedNum < 1 || selectedNum > 6) {
//            System.out.println("불가능한 메뉴 선택입니다.");
//        } else {
//            if(selectedNum == 1) {
//                System.out.println("메뉴 1을 선택하셨습니다.");
//            } else if(selectedNum == 2) {
//                System.out.println("메뉴 2를 선택하셨습니다.");
//            } else if(selectedNum == 3) {
//                System.out.println("메뉴 3를 선택하셨습니다.");
//            } else if(selectedNum == 4) {
//                System.out.println("메뉴 4를 선택하셨습니다.");
//            } else if(selectedNum == 5) {
//                System.out.println("메뉴 5를 선택하셨습니다.");
//            } else {
//                System.out.println("메뉴 6을 선택하셨습니다.");
//            }
//        }

//        switch문 사례
//        switch(selectedNum) {
//            case 1:
//                System.out.println("메뉴 1을 선택하셨습니다.");
//                break;
//            case 2:
//                System.out.println("메뉴 2를 선택하셨습니다.");
//                break;
//            case 3:
//                System.out.println("메뉴 3을 선택하셨습니다.");
//                break;
//            case 4:
//                System.out.println("메뉴 4를 선택하셨습니다.");
//                break;
//            case 5:
//                System.out.println("메뉴 5를 선택하셨습니다.");
//                break;
//            case 6:
//                System.out.println("메뉴 6을 선택하셨습니다.");
//                break;
//            default:
//                System.out.println("잘못 선택하셨습니다.");
//        }

    }
}
