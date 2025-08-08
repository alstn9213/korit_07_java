package ch14_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
//        추상 클래스는 객체 생성을 '원래는' 못한다.
        Factory factory1 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [ " + model + " ]을 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("가전 제품 공장을 관리합니다.");
            }
        }; // 메서드를 정의하는 것이 아니라 객체를 생성한 것이기때문에 ;를 꼭 명시해야한다.
        factory1.setName("가전 제품 공장"); // 원래 추상 클래스로는 객체를 생성할 수 없지만 익명 클래스로 객체를 생성할 수 있고, 그 경우 추상 클래스에 정의된 setName을 사용할 수 있다.
        factory1.showInfo();
        /*
        이상의 개념은 익명 클래스로, 람다식(Lambda Expression)으로 대체되는 경우가 많다.(javaScript에도 동일하게 적용)

        재사용하지않고 한 번만, 즉 이 경우에는 FactoryMain 에서만 쓸 예정이라면 익명 클래스를 사용하기 좋다.
         */
        System.out.println();
        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 스마트폰 공장");
//      추상 메서드를 구현한 메서드
        phoneFactory1.produce("아이폰17에어");
        phoneFactory1.manage();
//        일반메서드
        phoneFactory1.showInfo();
        System.out.println();

        TabletFactory tabletFactory1 = new TabletFactory("애플 태블릿 공장");
        tabletFactory1.setName("구글 태블릿 공장");
        System.out.println("현재 공장은 " + tabletFactory1.getName() + "으로 변경되었습니다.");
        tabletFactory1.produce("구글 태블릿");
        tabletFactory1.manage();
        tabletFactory1.upgrade("구글 태블릿 10인치 2세대");
        System.out.println();

        Factory factory2 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(model + "검퓨터를 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("컴퓨터 공장을 관리합니다.");
            }
        };
        factory2.setName("삼성 컴퓨터 공장");
        factory2.showInfo();

    }
}
