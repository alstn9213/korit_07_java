package ch14_abstraction.abstract_classes;

public class TabletFactory extends Factory {

    public TabletFactory() {
    }

    public TabletFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println(model + "모델을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("테블릿 공장을 관리합니다.");
    }

    public void upgrade(String model) {
        System.out.println(model+"로 업그레이드합니다.");
    }
}
