package self.builders;

import lombok.ToString;

@ToString
class Person {

    private String name;


    private Person(String name) {
        this.name = Name(name);
    }
    String Name(String name) {
        return name;
    }
}

public class BuildersEx {
    public static void main(String[] args) {
//        Person person = new Person().Name()
    }
 }

