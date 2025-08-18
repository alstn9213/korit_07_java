package ch23_lambda;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y; // Calculator 인터페이스의 객체명이 add고, 내부 메서드는 calculate()
        Calculator sub = (x, y) -> x - y; // Calculator 인터페이스의 객체명이 sub고, 내부 메서드는 calculate()
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println(add.calculate(2,3));
        System.out.println(sub.calculate(2,3));

        System.out.println("--- static method 호출방식 결과---");

        System.out.println("2 + 3 = " + operate(2,3,add));
//        세번째 매개변수로 Calculator 인터페이스의 서브 클래스를 받는다.
//        그리고 return문을 볼때 해당 객체의 .calculate() 메서드를 호출하는 것을 알수있다.
//        근데 add.calculate()는 return이 x + y니까 , 결과값이 5가 나왔다.
//        Calculator 인터페이스와, CalculatorMain의 static method와, 그리고 main의 lambda식을 전부 왔다갔다하며 볼 필요가 있다.
        System.out.println("2 * 3 = " + operate(2,3,mul));

    }
}
