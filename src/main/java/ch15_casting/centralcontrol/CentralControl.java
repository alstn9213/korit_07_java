package ch15_casting.centralcontrol;

public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) {
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다.");
    }

    private int checkEmpty() {
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null){
                return i;
            }
        }
        return -1; // 자바에서 실패를 나타낼 때 -1을 많이 사용한다.
    }

    public void powerOn() {
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null) {
                System.out.println("장치가 없어 전원을 켜지않았습니다.");
                continue;
            }
            deviceArray[i].on();
        }
    }

    public void powerOff() {
        for(Power device : deviceArray) {
            if(device == null) {
                System.out.println("장치가 없어 전원을 끌 수 없습니다.");
                continue;
            }
            device.off();
        }
    }
    public void showInfo(){
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null) {
                System.out.println("슬롯 [ " + (i+1) + " ] 번 : Empty");
                continue;
            }
            System.out.println("슬롯 [ " + (i+1) + " ] 번 : " + deviceArray[i].getClass().getSimpleName());

        }
    }

    public void performSpecificMethod() {
        for(Power device : deviceArray) {
            if(device instanceof AirConditioner) { // Power의 서브클래스가 잘못된 다운캐스팅을 하지않도록 하는 조건문
                AirConditioner airConditioner = (AirConditioner) device;
                airConditioner.changeMode();
            } else if(device instanceof Computer) {
                Computer computer = (Computer) device;
                computer.compute();
            } else if(device instanceof LED) { // Power의 서브클래스가 잘못된 다운캐스팅을 하지않도록 하는 조건문
                LED led = (LED) device;
                led.changeColor();
            } else if(device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if(device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device instanceof Printer) {
                Printer printer = (Printer) device;
                printer.print();
            } else if(device == null) {
                System.out.println("장치가 비어있습니다.");
            }
            else {
                System.out.println("아직 지원하지 않는 기기입니다.");
            }
        }
    }

}

