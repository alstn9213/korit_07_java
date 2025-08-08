package ch13_inheritance;

public class Human extends Animal{

    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void read(String str) {
        System.out.println(super.getAnimalName()+"가 "+str+"을 읽는 중입니다.");
    }
}
