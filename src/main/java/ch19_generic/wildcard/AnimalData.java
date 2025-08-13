package ch19_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;
//    AnimalData의 필드인 animal에 Animal 클래스의 상속을 받은 Tiger / Human 객체를 필드에 대입하고
//    상속받지않은 Car클래스의 객체는 넣지못하도록 제한할 필요가 있다.

    public void showData() {
        ((Animal) animal).move(); // 앞부분의 Animal은 형변환 부분/ animal은 필드이름이다.
//        AnimalData의 필드인 animal을 Animal타입으로 형변환해서 .move() 메서드를 호출했다.

        if(animal.getClass() == Human.class) {
            ((Human)animal).read(); // 조건문에서 Human 클래스인것을 걸렀지만 프로그램은 그것을 확신할 수 없다.
        } else if (animal.getClass() == Tiger.class) {
            ((Tiger)animal).hunt();
        }
    }
}
