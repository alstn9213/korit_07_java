package ch14_abstraction.abstract_classes;

public abstract class Factory {
    private String name;

    public Factory() {
    }

    public Factory(String name) {
        this.name = name;
    }

    public abstract void produce(String model);

    public abstract void manage();
    /*
    추상 클래스는 추상 메서드가 하나라도 있는 클래스.
    객체를 만들지 못하고 추상 메서드가 있는 클래스가 추상 클래스라면
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showInfo() {
        System.out.println("공장의 정보를 출력합니다.\n공장 이름 : " + name);
    }
}

