package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(new PowerButton(), new ChannelDownButton(), new ChannelUpButton());
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        System.out.println();
        tvRemoteController.onPressedChannelUpButton();
        System.out.println(tvRemoteController.onUpChannelUpButton());
//        tvRemoteController.onUpChannelUpButton();
        System.out.println();
        TvRemoteController tvRemoteController2 = new TvRemoteController(new VolumeDownButton(), new VolumeUpButton());
        tvRemoteController2.onPressedVolumeDownButton();
        tvRemoteController2.onDownVolumeDownButton();
        tvRemoteController2.onPressedVolumeUpButton();
        System.out.println(tvRemoteController2.onUpVolumeUpButton()); // 방법 1
        tvRemoteController2.onUpVolumeUpButton2(); // 방법 2
//        ----------------------------------
        System.out.println();
        AirConditionerController airConditionerController1 = new AirConditionerController(new TemperatureUpButton(), new TemperatureDownButton(), new ModeChangeButton(), new PowerButton());
        airConditionerController1.onPressedPowerButton();
        airConditionerController1.onPressedTemperatureDownButton();
        airConditionerController1.onDownTemperatureDownButton();
        airConditionerController1.onPressesdTemperatureUpButton();
        System.out.println(airConditionerController1.onUpTemperatureUpButton());
        airConditionerController1.modeChange();
        airConditionerController1.modeChange();
        airConditionerController1.onPressedPowerButton();



    }
}
