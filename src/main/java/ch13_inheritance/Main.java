package ch13_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("나비");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal("바둑이", 2);

        Tiger tiger1 = new Tiger();
//        tiger1.setAnimalName("푸바오");
//        tiger1.setAnimalAge(3);
//        String tigerName = tiger1.getAnimalName();
//        int tigerAge = tiger1.getAnimalAge();
//        System.out.println("이 호랑이의 이름은 "+tigerName+"이고 나이는 "+tigerAge+"살 입니다.");
//
//        tiger1.hunt();
//        tiger1.hunt("물고기");
//
//        tiger1.move();
//        animal1.move();

        Human human1 = new Human();
        human1.setAnimalName("김민수");
        human1.move();
        String humanName = human1.getAnimalName();
        human1.setAnimalAge(27);
        int humanAge = human1.getAnimalAge();
        System.out.println("안녕하세요. 제 이름은 " + humanName + "이고 나이는 "+ humanAge+"살 입니다.");
        System.out.println("내년에는 "+(humanAge+1)+"살이 됩니다.");
        human1.read("자바의 기초");

    }
}
