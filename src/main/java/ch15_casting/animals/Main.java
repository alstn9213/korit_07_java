package ch15_casting.animals;

public class Main {
    public static void main(String[] args) {
//        ------- 업캐스팅 ---------------
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();

        Animal animal1 = dog1; // 업캐스팅 #1
        animal1.makeSound(); // 개가 짖습니다. 즉 재정의된 메서드가 호출됨
//        animal1.fetch(); 불가능
        Animal animal2 = new Dog(); // A a = new B();
        animal2.makeSound(); // 개가 짖습니다.
//        animal2.fetch(); 불가능

        Animal animal3 = new Animal();
        animal3.makeSound(); // 동물이 소릴 냅니다.

        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1); // true
        boolean result2 = animal2 instanceof Animal; // true

//        업캐스팅이 일어나지않고 참조변수의 타입과 참조값이 일치하는 객체역시 true
        boolean result3 = dog1 instanceof Animal;
        boolean result4 = animal2 instanceof Animal;
        boolean result5 = animal3 instanceof Animal;

        boolean result6 = animal3 instanceof Dog; // false

//      ------------다운캐스팅 ----------------
//        다운 캐스팅은 ()를 사용해 명시적으로 이루어져야한다.
        Dog dog2 = (Dog) animal2; // 참조자료형 다운캐스팅
        dog2.makeSound();
        dog2.fetch();

//        Dog dog3 = (Dog) animal3; // 다운캐스팅 과정에서 오류발생
//        dog3.makeSound();
        /*
        animal3는 A a=new A() 방식으로 생성해서 하위 클래스의 인스턴스로 다운캐스팅하는 것이 불가능하다.

         */
        Animal animal4 = new Dog();
        System.out.println("animal4 검증파트");
        if(animal4 instanceof Dog) {
            Dog dog4 = (Dog) animal4;
            dog4.makeSound();
            dog4.fetch();
        }
        if(animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;
            dog3.makeSound();
            dog3.fetch();
        } else {
            System.out.println("불가능한 다운 캐스팅입니다.");
        }
    }
}
