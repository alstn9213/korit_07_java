package ch18_static.singleton;


import lombok.Getter;

public class Samsung {

    private static Samsung instance;

    @Getter
    private String company;
    private int serialNumber;

    private Samsung() {
//        company = getClass().getSimpleName(); // samsung
        company = "samsung";
        serialNumber = 20250000; // 객체 생성시 필드값 초기화
    }

    public static Samsung getInstance() {
        if(instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber; // 다수의 객체에서 createSerialNumber메서드를 호출하더라도 싱글톤이라 객체는 하나만 생성되고 serialNumber는 중복되지않는다.
    }

}
