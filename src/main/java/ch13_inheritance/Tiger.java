package ch13_inheritance;

public class Tiger extends Animal {

    // 고유 메서드
    public void hunt() {
        System.out.println(getAnimalName()+"이(가) 사냥을 합니다.");
    }
    // 고유 메서드 (오버로딩)
    public void hunt(String prey) {
        System.out.println(getAnimalName()+"이(가) " + prey + "를 사냥합니다.");
    }

//    재정의 : 부모 메서드와 결과값이 다르면 재정의
    @Override
    public String getAnimalName() {
        return super.getAnimalName() + "님";
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override // 메서드명만 동일하고 전부 재정의
    public void move() {
        System.out.println("호랑이가 네 발로 걷습니다.");
    }
}
