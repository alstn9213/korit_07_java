package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
//        Person person1 = new Person(); //생성자를 private으로 해서 생성자로 객체 생성 불가능

//        이하의 예시는 AllArgsConstructor
        Person person1 = new Person.Builder().age(38).address("부산광역시 연제구").name("안근수").build(); // Builder()는 기본생성자를 호출한다. Builder에 static을 붙여서
//        객체만들 필요없이 바로 생성자 호출 가능
        System.out.println(person1);

//        NonArgsConstructor
        Person person2 = new Person.Builder().build();
        System.out.println(person2);

        Person person3 = new Person.Builder().address("서울 특별시 종로구").build();
    }
}
