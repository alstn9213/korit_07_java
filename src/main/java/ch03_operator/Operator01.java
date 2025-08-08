package ch03_operator;
/*
    Camel case -> Java 상에서의 변수 표기법(Js에서도 사용)
    Snake case -> Java에서는 거의 안씀. 다만 전체 상수 사용시에 비슷한 표기법이 사용된다.
    Pascal case -> 모든 단어의 첫번째 알파벳이 대문자
        ex) 한 단어: Operator01
        ex) 복수 단어: OperatorTestResult -> Pascal Case는 클래스 명명 규칙에 해당한다.

 */
public class Operator01 {
    public static void main(String[] args) {
        int i = 10;
        // 대입 연산자 '='
        i = i + 1;
        /*
            대입연산자 '=': 대입연산자 왼쪽과 오른쪽이 같다는 의미가 아니라, 오른쪽에 있는 데아터를 왼쪽에 있는 변수에 '대입'한다는 의미.
            왼쪽과 오른쪽이 같은 값일 경우 '=='
         */

//        일반 연산자
        /*
        +:더하기
        -:빼기
        *:곱하기
        /:나누기
        %:나머지
         */
        int a = 5;
        int b = 2;
        double result = (double) a / b; // (double)은 강제 '형변환'개념이다.
        System.out.println(a/b);    // 2
        System.out.println(result); // 2.5

        /*
        복합 대입 연산자
        1) +=
        2) -=
        3) *=
        4) /=
         */
        int num1 = 1;
        System.out.println(num1);
        num1 += 2; // num1 = num1 + 2;
        System.out.println(num1);
        num1 -= 1; // num1 = num1 -1;
        System.out.println(num1);
        num1 *= 10;
        System.out.println(num1);
        num1 /= 5;
        System.out.println(num1);

        int j = 10;
        System.out.println(j);
        System.out.println(j++); // 변수명++: 코드를 실행시킨 후에 j에 1을 더함/ 그래서 10 출력
        System.out.println(j);  // 위의 코드가 실행되고 +1이 됐기 때문에 11출력
        System.out.println(++j); // ++변수명: 코드를 실행시키기전에 j에 1을 더함/ 그래서 12출력
        System.out.println(j); // 위에 더한 상태로 출력된거라 위와 동일하게 12출력
        System.out.println(j--); // 12
        System.out.println(j); // 11
        System.out.println(--j); // 10
        System.out.println(j); // 10
        // 번수명--: 코드를 실행시킨 후에 j에 1을 감함.
        // --번수명: 코드를 실행시킨 전에 j에 1을 감함.

        int age = 10;
        System.out.println("제 나이는 " + age + "살 입니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");

    }
}
