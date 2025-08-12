package ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {

    private String factoryName;

    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");

        String model = "갤럭시S26";

//        String serial;
//        Samsung samsung = Samsung.getInstance();
//        serial = samsung.createSerialNumber(model);

        Samsung samsung = Samsung.getInstance();
        String serial = samsung.createSerialNumber(model);

//        지역변수
         SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);
         return smartPhone;
    }
}
