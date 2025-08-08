package ch15_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
      Computer computer1 = new Computer();
      AirConditioner airConditioner1 = new AirConditioner();
      Speaker speaker1 = new Speaker();

//      Power[] powers = new Power[5];

//        powers를 생성하면서 원소들을 넣으면 크기가 고정된다.
//      Power[] powers = {new Computer(), new AirConditioner(), new Speaker()};

      CentralControl centralControl = new CentralControl(new Power[5]);

      centralControl.addDevice(computer1); // 업캐스팅이 일어남
      centralControl.addDevice(airConditioner1);
      centralControl.addDevice(speaker1);
      centralControl.addDevice(speaker1);
      centralControl.addDevice(speaker1);
      centralControl.addDevice(speaker1);


    }
}
