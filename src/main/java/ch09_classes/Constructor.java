package ch09_classes;

public class Constructor {
    int num;
    String name;

//    기본 생성자 정의 -> 원래 기본적으로 만들어진다.
//    기본 생성자는 메서드 중에서 input과 output이 없는 유형이다.
//    클래스명과 동일한 메서드명을 가진다.
    Constructor() {
        System.out.println("NoArgsConstructor(기본 생성자)");
    }
//    매개변수를 필요로하는 생성자는 자동으로 만들어지지 않기에 개발자가 정의해야한다.
//    그런데 개발자가 정의하면 기본생성자도 사라지기때문에 둘을 같이 쓰려면 둘다 직접정의해야한다.
//    여기서 메서드 오버로딩이 적용된다
    Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number; // 생성자를 정의하는 시점에서 객체는 아직 생성되지않아 어떤 객체에 매개변수의 값을 전달할지 알 수 없다.
        // 그래서 나중에 만들 객체의 이름을 대신해 일단 this로 정의한뒤 나중에 객체가 생성되면
        // jvm이 자동으로 this에 객체의 이름을 대입한 뒤 값을 할당한다.
    }
    Constructor(String title) {
            System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
            this.name = title;
        }
    }

