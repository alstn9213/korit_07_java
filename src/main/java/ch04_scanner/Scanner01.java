package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
//        변수 선언
//        String name;
//        name = "안근수";
//        System.out.println(name);
        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>> ");
//        name = scanner.nextLine();
        /*
        1. println 과 print의 차이
            ln : line new -> println 으로 실행할 경우, 출력문이 다 나오면 자동으로 개행됨.
            print로 작성할 경우에 동일 라인에 그대로 연결됨.
        2. nextLine / nextInt /
         */
        System.out.print("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();
        System.out.print("이름을 다시 입력하세요 >>> ");
        String name = scanner.next(); // 입력을 ahn geunsu
        System.out.println(name);
        System.out.println(year);

        /*
            2. next(Int/ Double, ... etc) vs nextLine
                -nextLine은 띄어쓰기를 허용한다. enter키, 즉 개행을 기준으로 데이터가 변수에 저장됨
                -나머지는 허용하지 않는다. 띄어쓰기하면 잘려서 대입됨.
         */
//        System.out.print("올해는 몇 년도 인가요? >>> ");
//        int year = scanner.nextInt();
//        scanner.nextLine(); // 배리어 역할을 하는 nextLine() // 사용되지않으므로 변수에 대입하지않음.
//        System.out.print("당신의 이름은? >>> ");
//        String name = scanner.nextLine();
//
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name);


        /*
        이상의 코드에서 문제점은 데이터를 입력받지않고 그대로 넘어간다는 점이다.
        왜냐하면 nextInt()에서 값을 입력하고 enter를 치면 다음 nextLine()에서는 enter키를 받아들여서
        빈값인 상태로 enter를 쳤다고 인지하기때문에 곧장 출력문으로 넘어감.

        해결방법 : enter키를 받아주는 nextLine()을 하나 더 만들어 준다.
         */

        /*
        1)
        나이를 입력하세요 >>> 19
        저는 올해 19살입니다.
        내년에는 20살이 됩니다.

        2) 점수를 입력하세요 >>>
        이름을 입력하세요 >>>
        김일 학생의 점수는 4.5입니다.
         */
//        System.out.print("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();
//        System.out.println("저는 올해 " + age + "입니다.");
//        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");

//        System.out.print("점수를 입력하세요 >>> ");
//        double score = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.nextLine();
//        System.out.println(name + " 학생의 점수는 " + score + "입니다.");

//        System.out.println("풀이법 #2 : nextLine()을 쓰지않는 방법");
//        System.out.print("점수를 입력하세요 >>> ");
//        double score = scanner.nextDouble();
//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.next();
//        System.out.println(name + " 학생의 점수는 " + score + "입니다.");


    }
}
