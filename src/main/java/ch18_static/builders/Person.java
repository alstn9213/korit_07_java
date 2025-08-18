package ch18_static.builders;

import lombok.ToString;

@ToString
public class Person {
    private String name;
    private int age;
    private String address;


    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

     public Builder name(String name) {
         this.name = name; // 객체가 생성되면 객체 이름으로 치환되는 키워드
         return this; // name에 값이 없다가 값이 대입된 객체가 리턴됨
     }
     public Builder age(int age) {
         this.age=age;
         return this;
     }
     public Builder address(String address) {
         this.address = address;
         return this;
        }
//       여기까지의 메서드는 필드에 값이 대입된 빌더 객체가 리턴된다.

        public Person build() {
         return new Person(this); // 이 this는 Builder 클래스의 인스턴스에 해당한다.
        }
    }
}
