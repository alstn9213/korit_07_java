package ch08_methods;

public class Overloading {
    public static void add() {
        System.out.println("add()");
    }
//    overloading적용
    public static void add(String s) {
        System.out.println("add(String s)");
        System.out.println(s + "!");
    }
    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
        System.out.println(a + b);
    }
    public static void add(int a, String s) {
        System.out.println("add(int a, String s)");
        System.out.println(a + " / " + s);
    }
    public static void add(String s, int a) {
        System.out.println("add(String s, int a)");
        System.out.println(a + " / " + s);
    }
    public static void add(int a, int b, double c) {
        System.out.println("add(int a, int b, double c)");
        System.out.println("a+b+c = "+(a+b+c)); // 원래라면 String이 먼저오기때문에 입력값 전체가 String으로 변한다. ()로 숫자를 묶어 연산을 먼저 한다.
    }

    public static void main(String[] args) {
     add();
     add("안녕하세요");
     add(1, 2);
     add(8, "월 1일");
     add("월 1일", 8);

    }
}
