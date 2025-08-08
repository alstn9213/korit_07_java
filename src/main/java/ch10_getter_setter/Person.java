package ch10_getter_setter;

public class Person {
    String name;
    int age;

    Person() {

    }
    Person(String name) {
        this.name = name;
    }
    Person(int age) {
        this.age = age;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//  Setter 정의
    public void setName(String title) {

        if(title.length() > 4) {
            System.out.println("변경할 수 없습니다.");
            return;
        } else {
            System.out.println("변경전 : " + name);

            this.name = title;
            System.out.println("이름이 변경되었습니다.");
            System.out.println("변경후 : " + name);
        }
    }
    public void setAge(int birth) {
        if(birth < 0 || birth > 200) {
            System.out.println("불가능한 나이 입력입니다.");
            return; // 즉시 종료
        }
        System.out.println("변경전 나이 : " + age);
        this.age = birth;
        System.out.println("변경후 나이 : " + age);

    }

//    Getter 정의
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
