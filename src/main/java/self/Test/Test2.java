package self.Test;


class Factory {
    private String factoryName;

    private static Factory instance;

    private Factory() {
        factoryName = "삼성 공장";
        System.out.println(factoryName + "객체가 생성되었습니다.");
    }

    public static Factory getInstance() {
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }
}

public class Test2 {
    public static void main(String[] args) {

        Factory.getInstance();
    }
}
