package ch10_getter_setter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "김일";
        person1.age = -10;

        Person person2 = new Person("김이");
        person2.age = 201;

        Person person3 = new Person(20);
        person3.name = "김삼";

        Person person4 = new Person("김사", 54);

        System.out.println(person1.age);
        System.out.println(person2.age);

//        System.out.println(person1.getName()); // 결과값 김일
//        person1.setName("디카프리오");
//        person1.name = "김일";
//        person1.name= "디카프리오";
//        System.out.println(person1.getName()); // 결과값 디카프리오

//        Setter / Getter를 통해서만 데이터의 입력 / 수정 / 조회를 가능하게 하고
//        필드에 직접 갓 대입하는 방식을 막도할 예정.

//        person4.setAge(789); // 불가능한 나이 입력입니다.
//        System.out.println(person4.age); // 54(기존나이)
//        person4.age = 789; // 필드에 값을 직접 대입
//        System.out.println(person4.age); // 789
//
////        부정확한 데이터의 입력을 막기위해 장기적으로는 method를 통헤 데이터에 접근해야함.
//
////        .length() -> String 자료형의 글자수를 return하는 메서드 -> 글자수니까 자료형은 int
//        System.out.println(person1.name.length());
////        . . 이 여러개 나오는 방식을 메서드 체이닝
//
//        String person1Sname = person1.getName();
//        System.out.println(person1Sname.length());
        System.out.println("--------------");
        person1.setName("노마드코더");
        System.out.println("--------------");
        person1.setName("이일");
        person1.getName();
    }
}
