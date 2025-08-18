package ch22_exception;

class Person {
    int age;
    String name;

    void showInfo() {
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);

    }
}

public class Exception01 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "김일";
        person1.age = 20;
//        person1.school = "코리아아이티";
        person1.showInfo();
//        person1.displayInfo();

//        int a = 10;
//        int b = 0;
//        int result = a / b;
//        System.out.println(result);

//       ---------------- 고전적 형태의 예외 처리 방식 -> if문------------------
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if(b == 0) {
//            System.out.println("나눌 수 없습니다.");
//        } else {
//            System.out.println("결과값은 : " + (a/b));
//        }

//       --------- 예외처리를 적용한 방식 -> try / catch / finally------------
        int a = 10;
        int b = 0;
        try {
            int result = a / b; // ArithmeticException 예외 발생 지점 -> catch 문으로 넘어감
            System.out.println("결과 : " + result);

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }

        /*
        * 프로그램이 정상 종료됨을 보증하기 위하여 예외 처리한다.
        * 일단 실행을 시켜서 오류가 나는 것을 확인해야하는가?
        * */

//        배열 인덱스 예외
        int[] numbers = { 1, 2, 3, 4 };
        try{
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) { // 예외 중에 가장 상위 예외 클래스에 해당함.
            throw new RuntimeException(e); // 디폴트 오류 메세지
        } finally {
            System.out.println("프로그램 정상 종료");
        }
        /*
        * catch문은 복수로 나올 수 있다.
        * 이때 순서가 중요하다.
        * */
    }
}
