package ch11_access_modifier;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = "김일";
        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());

    }
}
