package ch18_static.singleton;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("제 1 공장");
        Factory factory2 = new Factory("제 2 공장");
        Factory factory3 = new Factory("제 3 공장");
        Factory factory4 = new Factory("제 4 공장");

        SmartPhone smartPhone1 = factory1.produceSmartPhone();
        System.out.println(smartPhone1);
        SmartPhone smartPhone2 = factory2.produceSmartPhone();
        System.out.println(smartPhone2);
        SmartPhone smartPhone3 = factory3.produceSmartPhone();
        System.out.println(smartPhone3);
        SmartPhone smartPhone4 = factory4.produceSmartPhone();
        System.out.println(smartPhone4);
        SmartPhone smartPhone5 = factory1.produceSmartPhone();
        System.out.println(smartPhone5);
//        싱글톤 때문에 createSerialNumber 메서드를 호출한 결과는 계속 이어진다.
//        그래서 다수의 공장 객체에서 메서드를 호출해도 시리얼 넘버는 계속 증가한다.

    }
}
